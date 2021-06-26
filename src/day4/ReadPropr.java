package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropr {
	public static void main (String args[]) throws FileNotFoundException, IOException {
	//load the file
    String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    String appConfigPath = rootPath + "dataBase.properties";
   
    //load all the values in appProps
    Properties appProps = new Properties();
    appProps.load(new FileInputStream(appConfigPath));

   
   
    //get value from appProps
    System.out.println(appProps.getProperty("student_name"));
    //System.out.println(appProps.getProperty("course"));
}
}