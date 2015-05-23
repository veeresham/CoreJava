package com.test;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;

@SuppressWarnings("rawtypes")
public class CompilerListener implements DiagnosticListener
{
    public CompilerListener()
    {
        
    }
    
    public void report(Diagnostic diagnostic)
    {
        System.out.println(diagnostic.getColumnNumber());
        System.out.println(diagnostic.getLineNumber());
        System.out.println(diagnostic.getPosition());
        System.out.println(diagnostic.getStartPosition());
        System.out.println(diagnostic.getEndPosition());
    }
}