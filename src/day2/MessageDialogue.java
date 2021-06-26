package day2;

import javax.swing.*;

public class MessageDialogue {
	public static void main (String agrs[])
	{
	String name;

	name=JOptionPane.showInputDialog("Enter Name?");
	
	if(name.equals("abc"))
	{
	JOptionPane.showMessageDialog(null, "Name is invalid");
	}
	else {
	JOptionPane.showMessageDialog(null, "Name is valid");
	}

	}
}
