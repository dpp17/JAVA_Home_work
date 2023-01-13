package com.bridgelabz.daytwoprac;
									//objects are INSTANCE of a class

									//class is a BLUEPRINT


public class IndianState {
	//structure
	short districts;	//	number of districts are less than 127
	int populations;	//	127 < population < 4-bytes/32-bits
	boolean covidVaccine_top5;	//	boolean used as just to check if it 'is' or 'not'.
	String food;	//	string_input > 16-bit
	String Dance;	//	string_input > 16-bit
	byte sanctuary_nparks;	//	number of Wildlife_Sanctuary + National_Parks < 127
	
	public static void main(String[] args) {

//Objects_Creation
		IndianState punjab = new IndianState();	//	creating distinct objects of class "IndianState" to call variables
		IndianState jammukashmir = new IndianState();
		IndianState kerela = new IndianState();
		IndianState goa = new IndianState();
		IndianState karnataka = new IndianState();
		
//Punjab
		System.out.println("::  PUNJAB  ::");
		punjab.Dance="Bhangra";	//	assigning features to variable for distinct objects for unique features
		punjab.districts=23;
		punjab.food="makke_roti sarso_saag, Chole_Bhature";
		punjab.populations=27743338;
		punjab.covidVaccine_top5=false;
		punjab.sanctuary_nparks=12;
		System.out.println("Dance:: "+punjab.Dance+ '\n'+
				"Districts:: "+ punjab.districts+ '\n'+
				"Foods:: "+punjab.food+ '\n'+
				"State_Population:: "+punjab.populations+ '\n'+
				"Santuary/National_parks:: "+punjab.sanctuary_nparks+ '\n'+
				"State in Top_5 fastest Covid_Vaccinated:: "+punjab.covidVaccine_top5 );

//Jammu_Kashmir
		System.out.println('\n'+"::  JAMMU AND KASHMIR  ::");
		jammukashmir.Dance="Rouf";
		jammukashmir.districts=22;
		jammukashmir.food="Rogan_josh, Goshtaba, Kahva ";
		jammukashmir.populations=13635010;
		jammukashmir.covidVaccine_top5=false;
		jammukashmir.sanctuary_nparks=19;	
		System.out.println("Dance:: "+jammukashmir.Dance+ '\n'+
				"Districts:: "+ jammukashmir.districts+ '\n'+
				"Foods:: "+jammukashmir.food+ '\n'+
				"State_Population:: "+jammukashmir.populations+ '\n'+
				"Santuary/National_parks:: "+jammukashmir.sanctuary_nparks+ '\n'+
				"State in Top_5 fastest Covid_Vaccinated:: "+jammukashmir.covidVaccine_top5 );

//Kerela
		System.out.println('\n'+"::  KERELA  ::");		
		kerela.Dance="Mohiniyattam, Kathakali";
		kerela.districts=14;
		kerela.food="Erissery, Idiyappam, Puttu_Kadal_curry";
		kerela.populations=35330888;
		kerela.covidVaccine_top5=false;
		kerela.sanctuary_nparks=23;
		System.out.println("Dance:: "+kerela.Dance+ '\n'+
				"Districts:: "+ kerela.districts+ '\n'+
				"Foods:: "+kerela.food+ '\n'+
				"State_Population:: "+kerela.populations+ '\n'+
				"Santuary/National_parks:: "+kerela.sanctuary_nparks+ '\n'+
				"State in Top_5 fastest Covid_Vaccinated:: "+kerela.covidVaccine_top5 );
		
//Goa
		System.out.println('\n'+"::  GOA  ::");	
		goa.Dance="Fugdi, Dhalo";
		goa.districts=2;
		goa.food="Vindaloo";
		goa.populations=1542750;
		goa.covidVaccine_top5=false;
		goa.sanctuary_nparks=7;	
		System.out.println("Dance:: "+goa.Dance+ '\n'+
				"Districts:: "+ goa.districts+ '\n'+
				"Foods:: "+goa.food+ '\n'+
				"State_Population:: "+goa.populations+ '\n'+
				"Santuary/National_parks:: "+goa.sanctuary_nparks+ '\n'+
				"State in Top_5 fastest Covid_Vaccinated:: "+goa.covidVaccine_top5 );
	
//Karnataka
		System.out.println('\n'+"::  KARNATAKA  ::");
		karnataka.Dance="Dollu Kunitha";
		karnataka.districts=31;
		karnataka.food=" Bisi bele bhath, Ragi_mudde Sopinna_Saru, Mysore_Pak";
		karnataka.populations=61095297;
		karnataka.covidVaccine_top5=true;
		karnataka.sanctuary_nparks=32;
		System.out.println("Dance:: "+karnataka.Dance+ '\n'+
				"Districts:: "+ karnataka.districts+ '\n'+
				"Foods:: "+karnataka.food+ '\n'+
				"State_Population:: "+karnataka.populations+ '\n'+
				"Santuary/National_parks:: "+karnataka.sanctuary_nparks+ '\n'+
				"State in Top_5 fastest Covid_Vaccinated:: "+karnataka.covidVaccine_top5 );
	}

}
