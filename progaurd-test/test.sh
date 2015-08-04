#!sh -f

CLASSPATH=progaurd-test-0.0.1-SNAPSHOT.jar

for x in `ls spring-jars/*.jar` 
do
    CLASSPATH=$x:$CLASSPATH
done

JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_45.jdk/Contents/Home/

$JAVA_HOME/bin/java -cp $CLASSPATH com.test.Application
