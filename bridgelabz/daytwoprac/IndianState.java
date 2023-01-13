package com.bridgelabz.daytwoprac;
									//objects are INSTANCE of a class

									//class is a BLUEPRINT


public class IndianState {
	//structure
	byte sanctuaryNParks;	//	number of Wildlife_Sanctuary + National_Parks < 127
	short districts;	//	number of districts are less than 127
	int populations;	//	127 < population < 4-bytes/32-bits
	boolean covidVaccineTop5;	//	boolean used as just to check if it 'is' or 'not'.
	String food;	//	string_input > 16-bit
	String Dance;	//	string_input > 16-bit

	
	public static void main(String[] args) {

//Objects_Creation
		IndianState punjab = new IndianState();	//	creating distinct objects of class "IndianState" to call variables
		IndianState jammuKashmir = new IndianState();
		IndianState kerela = new IndianState();
		IndianState goa = new IndianState();
		IndianState karnataka = new IndianState();
		
//Punjab
		System.out.println("::  PUNJAB  ::");
		punjab.Dance="Bhangra";	//	assigning features to variable for distinct objects for unique features
		punjab.districts=23;
		punjab.food="makke_roti sarso_saag, Chole_Bhature";
		punjab.populations=27743338;
		punjab.covidVaccineTop5=false;
		punjab.sanctuaryNParks=12;
		System.out.println("Dance:: "+punjab.Dance+ '\n'+
				"Districts:: "+ punjab.districts+ '\n'+
				"Foods:: "+punjab.food+ '\n'+
				"State_Population:: "+punjab.populations+ '\n'+
				"Santuary/National_parks:: "+punjab.sanctuaryNParks+ '\n'+
				"State in Top_5 fastest Covid_Vaccinated:: "+punjab.covidVaccineTop5 );

//jammuKashmir
		System.out.println('\n'+"::  JAMMU AND KASHMIR  ::");
		jammuKashmir.Dance="Rouf";
		jammuKashmir.districts=22;
		jammuKashmir.food="Rogan_josh, Goshtaba, Kahva ";
		jammuKashmir.populations=13635010;
		jammuKashmir.covidVaccineTop5=false;
		jammuKashmir.sanctuaryNParks=19;	
		System.out.println("Dance:: "+jammuKashmir.Dance+ '\n'+
				"Districts:: "+ jammuKashmir.districts+ '\n'+
				"Foods:: "+jammuKashmir.food+ '\n'+
				"State_Population:: "+jammuKashmir.populations+ '\n'+
				"Santuary/National_parks:: "+jammuKashmir.sanctuaryNParks+ '\n'+
				"State in Top_5 fastest Covid_Vaccinated:: "+jammuKashmir.covidVaccineTop5 );

//Kerela
		System.out.println('\n'+"::  KERELA  ::");		
		kerela.Dance="Mohiniyattam, Kathakali";
		kerela.districts=14;
		kerela.food="Erissery, Idiyappam, Puttu_Kadal_curry";
		kerela.populations=35330888;
		kerela.covidVaccineTop5=false;
		kerela.sanctuaryNParks=23;
		System.out.println("Dance:: "+kerela.Dance+ '\n'+
				"Districts:: "+ kerela.districts+ '\n'+
				"Foods:: "+kerela.food+ '\n'+
				"State_Population:: "+kerela.populations+ '\n'+
				"Santuary/National_parks:: "+kerela.sanctuaryNParks+ '\n'+
				"State in Top_5 fastest Covid_Vaccinated:: "+kerela.covidVaccineTop5 );
		
//Goa
		System.out.println('\n'+"::  GOA  ::");	
		goa.Dance="Fugdi, Dhalo";
		goa.districts=2;
		goa.food="Vindaloo";
		goa.populations=1542750;
		goa.covidVaccineTop5=false;
		goa.sanctuaryNParks=7;	
		System.out.println("Dance:: "+goa.Dance+ '\n'+
				"Districts:: "+ goa.districts+ '\n'+
				"Foods:: "+goa.food+ '\n'+
				"State_Population:: "+goa.populations+ '\n'+
				"Santuary/National_parks:: "+goa.sanctuaryNParks+ '\n'+
				"State in Top_5 fastest Covid_Vaccinated:: "+goa.covidVaccineTop5 );
	
//Karnataka
		System.out.println('\n'+"::  KARNATAKA  ::");
		karnataka.Dance="Dollu Kunitha";
		karnataka.districts=31;
		karnataka.food=" Bisi bele bhath, Ragi_mudde Sopinna_Saru, Mysore_Pak";
		karnataka.populations=61095297;
		karnataka.covidVaccineTop5=true;
		karnataka.sanctuaryNParks=32;
		System.out.println("Dance:: "+karnataka.Dance+ '\n'+
				"Districts:: "+ karnataka.districts+ '\n'+
				"Foods:: "+karnataka.food+ '\n'+
				"State_Population:: "+karnataka.populations+ '\n'+
				"Santuary/National_parks:: "+karnataka.sanctuaryNParks+ '\n'+
				"State in Top_5 fastest Covid_Vaccinated:: "+karnataka.covidVaccineTop5 );
	}

}
