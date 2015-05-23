package com.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;
import javax.tools.ToolProvider;

public class CompilerAPI
{
    @SuppressWarnings("rawtypes")
    public static void main(String[] args)
    {
        String str = "package com.test;"
                + "\n" + "public class Test {"
                + "\npublic static void test() {"
                + "\nSystem.out.println(\"Comiler API Test\")-;" + ""
                        + "\n}" + "\n}";

        SimpleJavaFileObject fileObject = new SampleSource("com.test.Test", str);
        JavaFileObject javaFileObjects[] = new JavaFileObject[] { fileObject };
        Iterable<? extends JavaFileObject> compilationUnits = Arrays
                .asList(javaFileObjects);

        Iterable<String> compilationOptionss = Arrays.asList(new String[] {
                "-d", "classes" });
        
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

        JavaFileManager fileManager = compiler.getStandardFileManager(
                diagnostics, Locale.getDefault(), Charset.defaultCharset());
        CompilationTask task = compiler.getTask(null, fileManager, diagnostics,
                compilationOptionss, null, compilationUnits);
        boolean status = task.call();
        
        if(!status)
        {
            System.out.println("Found errors in compilation");
            int errors = 1;
            for(Diagnostic diagnostic : diagnostics.getDiagnostics())
            {
                printError(errors, diagnostic);
                errors++;
            }
        }
        else
            System.out.println("Compilation sucessfull");
        
        try
        {
            fileManager.close();
        } catch (IOException e)
        {
        }

    }
    
    @SuppressWarnings("rawtypes")
    public static void printError(int number,Diagnostic diagnostic)
    {
        System.out.println();
        System.out.print(diagnostic.getKind()+"  : "+number+" Type : "+diagnostic.getMessage(Locale.getDefault()));
        System.out.print(" at column : "+diagnostic.getColumnNumber());
        System.out.println(" Line number : "+diagnostic.getLineNumber());
        System.out.println("Source : "+diagnostic.getSource());
        
    }

}
