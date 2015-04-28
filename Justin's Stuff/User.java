package cse360;
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

public class User {
	
	private static String name;
    private static String username;
	private static String role;
    private static String doctor;
	private static double painLevel;

	// The constructors may not be neccessary if all information
	// being stored into the database. Rather than constructors, we
	// could use getters to retieve data from the database and 
	// manipulate it 
	//--------------------------------------------------
	// Sets up the patient with default information
	//--------------------------------------------------
	
	//Overloaded Constructor
	public User(){
		
		this.name = "NULL";
		this.role = "NULL";
	}
	
	public static String getDoctor(){
            return doctor;
        }
        
        public static void setDoctor(String d){
            doctor = d;
        }
        
        public static String getName(){
		
		return name;
	}
	
	public static void setName(String input){
		
		name = input;
	}
        
        public static String getUsername()
        {
                return username;
        }
        
        public static void setUsername(String input)
        {
                username = input;
        }
	
	public static String getRole(){
		
		return role;
	}
	
	public static void setRole(String input){
		
		role = input;
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
	
	
	public static void setPatientPainLevel(double pain){
		
		painLevel = pain;
	}
}
