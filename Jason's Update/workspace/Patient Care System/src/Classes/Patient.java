package Classes;
import java.sql.*;
import javax.swing.*;
//**********************************************************
// Program Name: 
// Author : Jason Hargrave
// Date Written : 26 March 2015
// Class : CSE 360
// Brief Description: 
// 
// 
//***********************************************************

public class Patient {
	
	private static String patientName;
	private static String patientAddress;
	private static String birthDate;
	private static String userName;
	private static String password;
	private static String patientEmail;
	private static double patientPainLevel;
	private static int age;
	//private String medicalHistory
	

	// The constructors may not be neccessary if all information
	// being stored into the database. Rather than constructors, we
	// could use getters to retieve data from the database and 
	// manipulate it 
	//--------------------------------------------------
	// Sets up the patient with default information
	//--------------------------------------------------
	
	public Patient(){
		
		patientName = "Enter patient's name";
		patientAddress = "Enter patient's address";
		birthDate = "Enter patient's birth date";
		userName = "Enter patient's user name";
		password = "Enter patient's password";
		patientPainLevel = 0;
		age = 0;
		// This needs to call overloaded constructor it seems. may be wrong
	}
	
	//Overloaded Constructor
	public Patient(String patientName, String patientAddress, String birthDate, String userName,
			String password, double painLevel, int age){
		
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.birthDate = birthDate;
		this.userName = userName;
		this.password = password;
		this.patientPainLevel = painLevel;
		this.age = age;
	}
	
	
	//--------------------------------------------------
	// Sets the name for the patient
	//--------------------------------------------------
	public static void setPatientName(String name){
		
		patientName = name;
	}
	
	//--------------------------------------------------
	// Sets the address for the patient
	//--------------------------------------------------
	public static void setPatientAddress(String address){
		
		patientAddress = address;
	}
	
	//--------------------------------------------------
	// Sets the birth date for the patient
	//--------------------------------------------------
	public static void setBirthDate(String BirthDate){
		
		birthDate = BirthDate;
	}
	
	//--------------------------------------------------
	// Sets the user name for the patient
	//--------------------------------------------------
	public static void setUserName(String UserName){
		
		userName = UserName;
	}
	
	//--------------------------------------------------
	// Sets the password for the patient
	//--------------------------------------------------
	public static void setPassword(String Password){
		
		password = Password;
	}
	
	//--------------------------------------------------
	// Sets the email for the patient
	//--------------------------------------------------
	public static void setPatientEmail(String email){
		
		patientEmail = email;
	}
	
	//--------------------------------------------------
	// Sets the pain level for the patient
	//--------------------------------------------------
	public static void setPatientPainLevel(double painLevel){
		
		patientPainLevel = painLevel;
	}
	
	
	//--------------------------------------------------
	// Sets the age for the patient
	//--------------------------------------------------
	public static void setAge(int Age){
		
		age = Age;
	}
	
	//--------------------------------------------------
	// Returns the name for the patient
	//--------------------------------------------------
	public static String getPatientName(){
		
		return patientName;
	}
	
	//--------------------------------------------------
	// Returns the address for the patient
	//--------------------------------------------------
	public static String getPatientAddress(){
		
		return patientAddress;
	}
	
	//--------------------------------------------------
	// Returns the birth date for the patient
	//--------------------------------------------------
	public static String getBirthDate(){
		
		return birthDate;
	}
	
	//--------------------------------------------------
	// Returns the user name for the patient
	//--------------------------------------------------
	public static String getUserName(){
		
		return userName;
	}
	
	//--------------------------------------------------
	// Returns the password for the patient
	//--------------------------------------------------
	public static String getPatientPassword(){
		
		return password;
	}
	
	//--------------------------------------------------
	// Returns the pain level for the patient
	//--------------------------------------------------
	public static double getPatientPainLevel(){
		
		return patientPainLevel;
	}
	
	//--------------------------------------------------
	// Returns the age for the patient
	//--------------------------------------------------
	public static int getAge(){
		
		return age;
	}
	
	//--------------------------------------------------
	// Returns the email for the patient
	//--------------------------------------------------
	public static String getPatientEmail(){
		
		return patientEmail;
	}
	
	//--------------------------------------------------
	// Returns an integer representing the patients
	// priority for a patient queue
	//--------------------------------------------------
	public static double calcPatientPriority(int pain, int tiredness, int nausea, int depression, int anxiety,
			int drowsiness, int appetite, int wellbeing, int shortnessOfBreath){
		
		//Threshold represents tolerable symptoms
		int threshold = 4;
		//Patient Priority ranges from 1 to 10, 10 being the highest priority
		double patientPriority = 0;
		double painLevel = 0;
		double tiredLevel = 0;
		double nauseaLevel = 0;
		double depressionLevel = 0;
		double anxietyLevel = 0;
		double drowsinessLevel = 0;
		double appetiteLevel = 0;
		double wellbeingLevel = 0;
		double breathLevel = 0;
		
		//--------------------------------------------------
		// Pain Assessment
		//--------------------------------------------------
		if (pain >= 9){
			painLevel = pain;
			patientPriority = painLevel;
		}
		
		if (pain == 7 || pain == 8){
			painLevel = 1.6;
		}
		
		if (pain == 5 || pain == 6){
			painLevel = 1.2;
		}
		
		if (pain <= threshold){
			painLevel = pain/5;
		}
		
		//--------------------------------------------------
		// Tiredness Assessment
		//--------------------------------------------------
		if (tiredness >= 6){
			tiredLevel = 1.2;
		}
		
		if (tiredness <= 5){
			tiredLevel = tiredness/5;
		}
		
		//--------------------------------------------------
		// Nausea Assessment
		//--------------------------------------------------
		if (nausea >= 9){
			nauseaLevel = 1.4;
		}
		
		if (nausea >= 5 && nausea <= 8){
			nauseaLevel = 1;
		}
		
		if (nausea <= threshold){
			nauseaLevel = nausea/5;
		}
		
		//--------------------------------------------------
		// Depression Assessment
		//--------------------------------------------------
		if (depression >=8){
			depressionLevel = 1.6;
		}
		
		if (depression > threshold && depression <= 7){
			depressionLevel = 1.2;
		}
		
		if (depression <= threshold){
			depressionLevel = depression/5;
		}
		
		//--------------------------------------------------
		// Anxiety Assessment
		//--------------------------------------------------
		if (anxiety >= 9){
			anxietyLevel = 1.6;
		}
		
		if (anxiety > threshold && anxiety <= 8){
			anxietyLevel = 1.2;
		}
		
		if (anxiety <= threshold){
			anxietyLevel = anxiety/5;
		}
		
		//--------------------------------------------------
		// Drowsiness Assessment
		//--------------------------------------------------
		if (drowsiness >= 9){
			drowsinessLevel = 1.4;
		}
		
		if (drowsiness > threshold && drowsiness <= 8){
			drowsinessLevel = 1;
		}
		
		if (drowsiness <= threshold){
			drowsinessLevel = drowsiness/5;
		}
		
		//--------------------------------------------------
		// Appetite Assessment
		//--------------------------------------------------
		if (appetite >= 9){
			appetiteLevel = 1.4;
		}
		
		if (appetite > threshold && appetite <= 8){
			appetiteLevel = 1;
		}
		
		if (appetite <= threshold){
			appetiteLevel = appetite/5;
		}
		
		//--------------------------------------------------
		// Well being Assessment
		//--------------------------------------------------
		if (wellbeing >= 9){
			wellbeingLevel = wellbeing;
			patientPriority = wellbeingLevel;
		}
		
		if (wellbeing > threshold && wellbeing <= 8){
			wellbeingLevel = 2;
		}
		
		if (wellbeing <= threshold){
			wellbeingLevel = wellbeing/5;
		}
		
		//--------------------------------------------------
		// Shortness of Breath Assessment
		//--------------------------------------------------
		if (shortnessOfBreath >= 9){
			breathLevel = shortnessOfBreath;
			patientPriority = breathLevel;
		}
		
		if (shortnessOfBreath == 7 || shortnessOfBreath == 8){
			breathLevel = 2;
		}
		
		if (shortnessOfBreath > threshold && shortnessOfBreath >= 6){
			breathLevel = 1.2;
		}
		
		if (shortnessOfBreath <= threshold){
			breathLevel = shortnessOfBreath/5;
		}
		
		//--------------------------------------------------
		// Calculate Patient Priority for the Patient queue
		//--------------------------------------------------
                
                if (pain >= 9){
                    
                    setPatientPainLevel(patientPriority);
                    return pain;
                }
                if (wellbeing >= 9){
                    
                    setPatientPainLevel(patientPriority);
                    return wellbeing;
                }
                if (shortnessOfBreath >= 9){
                    
                    setPatientPainLevel(patientPriority);
                    return shortnessOfBreath;
                }
                else{
                    patientPriority = (painLevel + tiredLevel + nauseaLevel + depressionLevel +
				anxietyLevel + drowsinessLevel + appetiteLevel + wellbeingLevel + breathLevel);
                    
		setPatientPainLevel(patientPriority);
                
                return patientPriority;
                }
		
	
		//--------------------------------------------------
		// Insert the data into the symptom ratings table
		//--------------------------------------------------
		//INSERT INTO SYMPTOMRATINGS (NAME,PAINLEVEL,TIREDLEVEL,NAUSEALEVEL,DEPRESSIONLEVEL,ANXIETYLEVEL,DROWSINESSLEVEL,APPETITELEVEL,WELLBEINGLEVEL,BREATHLEVEL)
		//VALUES (patientName, painLevel, tiredLevel, nauseaLevel, depressionLevel, anxietyLevel, drowsinessLevel, appetiteLevel, wellbeingLevel, breathLevel); // We need some form of getter for the patient ID
	}
	
	
	//--------------------------------------------------
	// Patient Emergency
	//--------------------------------------------------
	public void patientEmergency(){
		
		System.out.println("An Ambulence is on its way!!!");
	}

	//--------------------------------------------------
	// String representation of the class 
	//--------------------------------------------------
	public String toString() {
		
		return ("Patient's name: " + patientName + "\n Patient's Address: "
				+ patientAddress + "\n Birth Date: " + birthDate + "\n Username: "
				+ userName + "\n Password: " + password + "\n Patient's Pain Level: "
				+ patientPainLevel + "\n Age: " + age);
	}
}
