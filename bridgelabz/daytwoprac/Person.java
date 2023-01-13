package com.bridgelabz.daytwoprac;
									//objects are INSTANCE of a class

									//class is a BLUEPRINT

public class Person {

	float height_cm;	//	height can be in decimal
	String color;	
	boolean long_hair;	//whether have long hair or not
	char gender;	// used only for 'M' or 'F'
	String build;
	String mobileno; // stored in string we don't have any use in calculation
	
	
	public static void main(String[] args) {

		Person ram=new Person();	//	creating distinct objects of class "Person" to call variables
		Person rohini=new Person();
		Person mayank=new Person();
		Person naaz_joshi=new Person();

//Ram		
		System.out.println("::  Person Name -> 'RAM'  ::");		
		ram.build="Athletic";	//	assigning features to variable for distinct objects for unique features
		ram.color="Black";
		ram.gender='M';
		ram.height_cm=197.59f;
		ram.long_hair=true;
		ram.mobileno="8921xxxxxx";
		System.out.println("Person's Build :: "+ram.build+'\n'+
				"Person's Color :: "+ram.color+'\n'+
				"Person's Gender :: "+ram.gender+'\n'+
				"Person's Height :: "+ram.height_cm+'\n'+
				"Person's Mobile_Number :: "+ram.mobileno+'\n'+
				"Do Person have Long_Hairs :: "+ram.long_hair);

//Rohini		
		System.out.println('\n'+"::  Person Name -> 'ROHINI'  ::");
		rohini.build="Lean";
		rohini.color="Asian_fair";
		rohini.gender='F';
		rohini.height_cm=164.75f;
		rohini.long_hair=true;
		rohini.mobileno="9292xxxxxx";
		System.out.println("Person's Build :: "+rohini.build+'\n'+
				"Person's Color :: "+rohini.color+'\n'+
				"Person's Gender :: "+rohini.gender+'\n'+
				"Person's Height :: "+rohini.height_cm+'\n'+
				"Person's Mobile_Number :: "+rohini.mobileno+'\n'+
				"Do Person have Long_Hairs :: "+rohini.long_hair);
		
//Mayank
		System.out.println('\n'+"::  Person Name -> 'MAYANK'  ::");
		mayank.build="Obese";
		mayank.color="Brown";
		mayank.gender='M';
		mayank.height_cm=175.6f;
		mayank.long_hair=false;
		mayank.mobileno="8465xxxxxx";
		System.out.println("Person's Build :: "+mayank.build+'\n'+
				"Person's Color :: "+mayank.color+'\n'+
				"Person's Gender :: "+mayank.gender+'\n'+
				"Person's Height :: "+mayank.height_cm+'\n'+
				"Person's Mobile_Number :: "+mayank.mobileno+'\n'+
				"Do Person have Long_Hairs :: "+mayank.long_hair);
	
//Naaz_Joshi
		System.out.println('\n'+"::  Person Name -> 'NAAZ JOSHI'  ::");
		naaz_joshi.build="Athletic";
		naaz_joshi.color="Fair";
		naaz_joshi.gender='T';
		naaz_joshi.height_cm=178f;
		naaz_joshi.long_hair=true;
		naaz_joshi.mobileno="9258xxxxxx";
		System.out.println("Person's Build :: "+naaz_joshi.build+'\n'+
				"Person's Color :: "+naaz_joshi.color+'\n'+
				"Person's Gender :: "+naaz_joshi.gender+'\n'+
				"Person's Height :: "+naaz_joshi.height_cm+'\n'+
				"Person's Mobile_Number :: "+naaz_joshi.mobileno+'\n'+
				"Do Person have Long_Hairs :: "+naaz_joshi.long_hair);
		
	}

}
