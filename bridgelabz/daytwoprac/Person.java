package com.bridgelabz.daytwoprac;
									//objects are INSTANCE of a class

									//class is a BLUEPRINT

public class Person {

	float heightCm;	//	height can be in decimal	
	boolean longHair;	//whether have long hair or not
	char gender;	// used only for 'M' or 'F'
	String color;
	String build;
	String mobileNo; // stored in string we don't have any use in calculation
	
	
	public static void main(String[] args) {

		Person ram=new Person();	//	creating distinct objects of class "Person" to call variables
		Person rohini=new Person();
		Person mayank=new Person();
		Person naazJoshi=new Person();

//Ram		
		System.out.println("::  Person Name -> 'RAM'  ::");		
		ram.build="Athletic";	//	assigning features to variable for distinct objects for unique features
		ram.color="Black";
		ram.gender='M';
		ram.heightCm=197.59f;
		ram.longHair=true;
		ram.mobileNo="8921xxxxxx";
		System.out.println("Person's Build :: "+ram.build+'\n'+
				"Person's Color :: "+ram.color+'\n'+
				"Person's Gender :: "+ram.gender+'\n'+
				"Person's Height :: "+ram.heightCm+'\n'+
				"Person's Mobile_Number :: "+ram.mobileNo+'\n'+
				"Do Person have longHairs :: "+ram.longHair);

//Rohini		
		System.out.println('\n'+"::  Person Name -> 'ROHINI'  ::");
		rohini.build="Lean";
		rohini.color="Asian_fair";
		rohini.gender='F';
		rohini.heightCm=164.75f;
		rohini.longHair=true;
		rohini.mobileNo="9292xxxxxx";
		System.out.println("Person's Build :: "+rohini.build+'\n'+
				"Person's Color :: "+rohini.color+'\n'+
				"Person's Gender :: "+rohini.gender+'\n'+
				"Person's Height :: "+rohini.heightCm+'\n'+
				"Person's Mobile_Number :: "+rohini.mobileNo+'\n'+
				"Do Person have longHairs :: "+rohini.longHair);
		
//Mayank
		System.out.println('\n'+"::  Person Name -> 'MAYANK'  ::");
		mayank.build="Obese";
		mayank.color="Brown";
		mayank.gender='M';
		mayank.heightCm=175.6f;
		mayank.longHair=false;
		mayank.mobileNo="8465xxxxxx";
		System.out.println("Person's Build :: "+mayank.build+'\n'+
				"Person's Color :: "+mayank.color+'\n'+
				"Person's Gender :: "+mayank.gender+'\n'+
				"Person's Height :: "+mayank.heightCm+'\n'+
				"Person's Mobile_Number :: "+mayank.mobileNo+'\n'+
				"Do Person have longHairs :: "+mayank.longHair);
	
//naazJoshi
		System.out.println('\n'+"::  Person Name -> 'NAAZ JOSHI'  ::");
		naazJoshi.build="Athletic";
		naazJoshi.color="Fair";
		naazJoshi.gender='T';
		naazJoshi.heightCm=178f;
		naazJoshi.longHair=true;
		naazJoshi.mobileNo="9258xxxxxx";
		System.out.println("Person's Build :: "+naazJoshi.build+'\n'+
				"Person's Color :: "+naazJoshi.color+'\n'+
				"Person's Gender :: "+naazJoshi.gender+'\n'+
				"Person's Height :: "+naazJoshi.heightCm+'\n'+
				"Person's Mobile_Number :: "+naazJoshi.mobileNo+'\n'+
				"Do Person have longHairs :: "+naazJoshi.longHair);
		
	}

}
