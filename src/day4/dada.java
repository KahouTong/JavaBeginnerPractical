package day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dada {

	public static void main (String args[]) throws SQLException {
		Connection con = null;
		try {
		//step 1 register driver
        Class.forName("com.mysql.jdbc.Driver");   
        //step 2 get connection
        con=DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/day4","root","12345");
        // portNumber/databaseName,userName,Password for database     
        //step 3 CRETE STATEMENT
        Statement stmt=con.createStatement();      
        //step 4 RUN STATEMENT
        ResultSet rs=stmt.executeQuery("select * from hotelmanagement");      
        while(rs.next())
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			con.close();
			System.out.println("close");
		}
		
	}
}
