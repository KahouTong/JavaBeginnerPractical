package day4;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ReadProperties {
	public static void main (String args[]) throws IOException, SQLException {
	Connection con = null;
	try {
	//setting path to properties file
	String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
	String appConfigPath = rootPath + "dataBaseExample.properties";		
	Properties appProps = new Properties();
	appProps.load(new FileInputStream(appConfigPath));				
	//step 1 register driver
    Class.forName(appProps.getProperty("driverPath"));      
    //step 2 get connection
    con=DriverManager.getConnection(
    appProps.getProperty("connection"),
    appProps.getProperty("username"),
    appProps.getProperty("password"));     
    //step 3 CRETE STATEMENT
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from students");      
    while(rs.next())
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) +" "+rs.getString(4));

	}
	catch (Exception e) {
		System.out.println(e);
	}
	finally {
		con.close();
	}
}
}