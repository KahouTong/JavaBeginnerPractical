package day4;

import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class HotelRecord {
	//welcome message and operation message
	static void welcomeDialog () {
		JOptionPane.showMessageDialog(null, "Welcome to HotelManagement System");
		JOptionPane.showMessageDialog(null, "1-Insert\n 2-Update\n 3-Show\n 4-Delete\n 5-Exit\n");
	}
			
	public static void main (String args[]) throws SQLException {
		Connection con = null;
		try {
		String selection,id,name,address,age,hpNumber,select;
		int empId, empAge;
		//step 1 register driver
        Class.forName("com.mysql.jdbc.Driver");   
        //step 2 get connection
        con=DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/day4","root","12345");
        // portNumber/databaseName,userName,Password for database     
        //step 3 CRETE STATEMENT
        Statement stmt=con.createStatement();      
        //step 4 RUN STATEMENT
        welcomeDialog();
        selection = JOptionPane.showInputDialog("Welcome Please select a option");
        //insert
        if (selection.equals("1")) {        	
        	id = JOptionPane.showInputDialog("Enter Employee Id number");
        	name = JOptionPane.showInputDialog("Enter Employee Name");
        	address = JOptionPane.showInputDialog("Enter Employee Address");
        	age = JOptionPane.showInputDialog("Enter Employee Age");
        	hpNumber= JOptionPane.showInputDialog("Enter Employee Hp Number");     	
        	empId=Integer.parseInt(id);
        	empAge=Integer.parseInt(age);
        	String sql="insert into hotelmanagement values('" + empId + "','" + name + "','" + address + "','" + empAge + "','" + hpNumber + "')";
        	stmt.executeUpdate(sql);
        	JOptionPane.showMessageDialog(null, "Data Recorded Successfully");        	
        }
      //update
        else if (selection.equals("2")) {
        	id = JOptionPane.showInputDialog("Enter Employee Id number to be update");
        	empId=Integer.parseInt(id);
        	JOptionPane.showMessageDialog(null, "Select which data you want to edit ");
        	select = JOptionPane.showInputDialog("1-name 2-address 3-age 4-hpNumber");
        	if (select.equals("1")) {
        		name = JOptionPane.showInputDialog("Enter Employee Name");
        		String sql = "UPDATE  hotelmanagement set Employee_NAME='"+name+"' where Employee_ID="+empId;
        		stmt.executeUpdate(sql);
        	}
        	else if (select.equals("2")) {
        		address = JOptionPane.showInputDialog("Enter Employee Address");
        		String sql = "UPDATE  hotelmanagement set Employee_Address='"+address+"' where Employee_ID="+empId;
        		stmt.executeUpdate(sql);
        	}
        	else if (select.equals("3")) {
        		age = JOptionPane.showInputDialog("Enter Employee Age");
        		empAge=Integer.parseInt(age);
        		String sql = "UPDATE  hotelmanagement set Employee_Age='"+empAge+"' where Employee_ID="+empId;
        		stmt.executeUpdate(sql);
        	}
        	else if (select.equals("4")) {
        		hpNumber= JOptionPane.showInputDialog("Enter Employee Hp Number");
        		String sql = "UPDATE  hotelmanagement set Employee_HpNo='"+hpNumber+"' where Employee_ID="+empId;
        		stmt.executeUpdate(sql);
        	}
        	else {
        		JOptionPane.showMessageDialog(null, "Selection Invalid");
        	}       	
        }
      //show
        else if (selection.equals("3")) {
            ResultSet rs=stmt.executeQuery("select * from hotelmanagement");      
            while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) +" "+rs.getString(4)+" "+rs.getString(5));
        }
      //delete
        else if (selection.equals("4")) {
        	id = JOptionPane.showInputDialog("Enter Employee Id number to delete record");
        	empId=Integer.parseInt(id);
        	String sql = "DELETE FROM hotelmanagement WHERE Employee_ID = "+empId+" ";
        	stmt.executeUpdate(sql);
        }
      //exit
        else if (selection.equals("5")) {
        	JOptionPane.showMessageDialog(null, "Thank you, bye !");
        	System.exit(0);
        }
        else {
        	JOptionPane.showMessageDialog(null, "Invalid Options");
        }     
		}
         
	catch(Exception e) {
		System.out.println(e);
	}
		
	finally {
        //STEP 5 CLOSE CONNECTION
        con.close();
        System.out.println("close");
	}
	}
}
