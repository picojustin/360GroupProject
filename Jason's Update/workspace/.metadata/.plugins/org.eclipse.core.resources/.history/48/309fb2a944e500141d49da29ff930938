package cse360;

import java.sql.*;

public class testConnector {
	  public static void main( String args[] )
	  {
		  
	    Connection c = null;
	    Statement stmt = null;
	    
	    try {
	    	
	    
	    	Connection connection = sqliteConnection.dbConnector();
	      stmt = connection.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM PatientTable;" );
	      while ( rs.next() ) {
	    	  
	         String name = rs.getString("name");
	         int  age = rs.getInt("age");
	         String username  = rs.getString("username");
	         String  password = rs.getString("password");
	         
	         System.out.println( "NAME = " + name );
	         System.out.println( "AGE = " + age );
	         System.out.println( "USERNAME = " + username );
	         System.out.println( "PASSWORD = " + password );
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
