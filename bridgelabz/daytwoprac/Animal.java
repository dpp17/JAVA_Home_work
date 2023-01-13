package com.bridgelabz.daytwoprac;
									//objects are INSTANCE of a class
									
									//class is a BLUEPRINT

public class Animal {
	byte pedalism;	//	number of legs they walk on < 127
	float lenght_cm;	//	height can be in decimal
	String typeofvore;	// string_input
	String gender;	//	string_input > 16-bit
	String sound;	//	string_input > 16-bit
	
	public static void main(String[] args) {
		Animal tiger = new Animal();	//	creating distinct objects of class "Animal" to call variables
		Animal giraffe = new Animal();
		Animal reticulatedpython = new Animal();
		Animal kangaroo= new Animal();
		Animal sakura= new Animal();

		System.out.println("::  TIGER  ::");//tiger
		tiger.gender="Male";	//	assigning features to variable for distinct objects for unique features
		tiger.lenght_cm=305f;
		tiger.pedalism=4;
		tiger.sound="Roar";
		tiger.typeofvore="Carnivore";
		
		System.out.println("Gender :: "+tiger.gender+'\n'+
				"Length of animal(in_cm) :: "+tiger.lenght_cm+'\n'+
				"Pedalism :: "+tiger.pedalism+'\n'+
				"Sound made by them :: "+tiger.sound+'\n'+
				"Type_of_Vore :: "+tiger.typeofvore);
		
		System.out.println('\n'+"::  GIRAFFE  ::");//giraffe
		giraffe.gender="Male";
		giraffe.lenght_cm=550f;
		giraffe.pedalism=4;
		giraffe.sound="Hum";
		giraffe.typeofvore="Herbivore";
		
		System.out.println("Gender :: "+giraffe.gender+'\n'+
				"Length of animal(in_cm) :: "+giraffe.lenght_cm+'\n'+
				"Pedalism :: "+giraffe.pedalism+'\n'+
				"Sound made by them :: "+giraffe.sound+'\n'+
				"Type_of_Vore :: "+giraffe.typeofvore);
		
		System.out.println('\n'+"::  RETICULATED_PYTHON  ::");//reticulatedpython
		reticulatedpython.gender="Male";
		reticulatedpython.lenght_cm=767.5f;
		reticulatedpython.pedalism=0;
		reticulatedpython.sound="Hiss";
		reticulatedpython.typeofvore="Carnivore";
		
		System.out.println("Gender :: "+reticulatedpython.gender+'\n'+
				"Length of animal(in_cm) :: "+reticulatedpython.lenght_cm+'\n'+
				"Pedalism :: "+reticulatedpython.pedalism+'\n'+
				"Sound made by them :: "+reticulatedpython.sound+'\n'+
				"Type_of_Vore :: "+reticulatedpython.typeofvore);
		
		System.out.println('\n'+"::  KANGAROO  ::");//kangaroo
		kangaroo.gender="Male";
		kangaroo.lenght_cm=244.9f;
		kangaroo.pedalism=2;
		kangaroo.sound="Chortle";
		kangaroo.typeofvore="Herbivore";
		
		System.out.println("Gender :: "+kangaroo.gender+'\n'+
				"Length of animal(in_cm) :: "+kangaroo.lenght_cm+'\n'+
				"Pedalism :: "+kangaroo.pedalism+'\n'+
				"Sound made by them :: "+kangaroo.sound+'\n'+
				"Type_of_Vore :: "+kangaroo.typeofvore);

		System.out.println('\n'+"::  HUMAN_SAKURA  ::");//Sakura
		sakura.gender="Female";
		sakura.lenght_cm=172.5f;
		sakura.pedalism=2;
		sakura.sound="Talk";
		sakura.typeofvore="Omnivore";
		
		System.out.println("Gender :: "+sakura.gender+'\n'+
				"Length of animal(in_cm) :: "+sakura.lenght_cm+'\n'+
				"Pedalism :: "+sakura.pedalism+'\n'+
				"Sound made by them :: "+sakura.sound+'\n'+
				"Type_of_Vore :: "+sakura.typeofvore);
	}

}
