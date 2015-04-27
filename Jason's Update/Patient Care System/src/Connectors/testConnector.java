package Connectors;

import java.sql.*;

public class testConnector {
	  public static void main( String args[] )
	  {
		  
	    Connection c = null;
	    Statement stmt = null;
	    
	    try {
	    	
	    
	    	Connection connection = sqliteConnection.dbConnector();
	      stmt = connection.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM PatientData;" );
	      while ( rs.next() ) {
	    	  
	         String name = rs.getString("name");
	         String username  = rs.getString("username");
	         String  password = rs.getString("password");
	         int  age = rs.getInt("age");
	         
	         System.out.println( "NAME = " + name );
	         System.out.println( "USERNAME = " + username );
	         System.out.println( "PASSWORD = " + password );
	         System.out.println( "AGE = " + age );
	         System.out.println();
	         
	      }
	      
	      rs.close();
	      stmt.close();
	      connection.close();
	      
	    } catch ( Exception e ) {
	    	
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    
	    System.out.println("Operation done successfully");
	    
	  }
}
