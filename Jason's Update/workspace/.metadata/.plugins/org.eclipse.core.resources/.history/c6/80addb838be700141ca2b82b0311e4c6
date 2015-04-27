package Connectors;

import java.sql.*;
import javax.swing.*;

public class sqliteConnection {
	Connection conn = null;
	public static Connection dbConnector(){
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Justin\\Desktop\\workspace\\Patient Care System\\src\\PatientCareSystemDatabase.sqlite");
			//JOptionPane.showMessageDialog(null, "Success!");
			return conn;
		}
		
		catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
