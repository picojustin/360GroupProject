package Classes;
import java.sql.*;
import javax.swing.*;
//**********************************************************
// Program Name: SystemAdmin
// Author : Justin Pico
// Date Written : 17 April 2015
// Class : CSE 360
// Brief Description: 
// 
// 
//***********************************************************

public class SystemAdmin {
	
	private String systemAdminName;
	private String userName;
	private String password;
	//private String medicalHistory
	
	//--------------------------------------------------
	// Sets up the patient with default information
	//--------------------------------------------------

	//Overloaded Constructor
	public SystemAdmin(String systemAdminName, String userName, String password){
		
		this.systemAdminName = systemAdminName;
		this.userName = userName;
		this.password = password;
	}

	// Adds a patient to the user database
	public void addPatient(String patientName, String patientAddress, String birthDate, String userName,
				String password, double painLevel, int age){
	}

	//Adds a doctor to the user database
	public void addDoctor(){

	}

	//Removes a patient from the user database
	public void removePatient(){

	}

	//Removes a doctor from the user database
	public void removeDoctor(){

	}
}