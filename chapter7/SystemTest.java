package chapter7;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) throws Exception{
        //get system's all environment variable
        Map<String, String> env = System.getenv();
        for(var name : env.keySet()){
            System.out.println(name+"--->"+env.get(name));
        }
        //get the specified environment value
        System.out.println(System.getenv("JAVA_HOME"));
        //get all the system properties
        Properties props = System.getProperties();
        //store all the system properties in propers.txt
        props.store(new FileOutputStream("props.txt"),"System Properties");
        //output the specified system properties
        System.out.println(System.getProperty("os.name"));
    }
}
