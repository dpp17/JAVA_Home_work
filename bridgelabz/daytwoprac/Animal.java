package com.bridgelabz.daytwoprac;
									//objects are INSTANCE of a class
									
									//class is a BLUEPRINT

public class Animal {
	
	byte pedalism;	//	number of legs they walk on < 127
	float lenghtCm;	//	height can be in decimal
	String typeOfVore;	// string_input
	String gender;	//	string_input > 16-bit
	String sound;	//	string_input > 16-bit
	
	public static void main(String[] args) {
		Animal tiger = new Animal();	//	creating distinct objects of class "Animal" to call variables
		Animal giraffe = new Animal();
		Animal reticulatedPython = new Animal();
		Animal kangaroo= new Animal();
		Animal sakura= new Animal();

		System.out.println("::  TIGER  ::");//tiger
		tiger.gender="Male";	//	assigning features to variable for distinct objects for unique features
		tiger.lenghtCm=305f;
		tiger.pedalism=4;
		tiger.sound="Roar";
		tiger.typeOfVore="Carnivore";
		
		System.out.println("Gender :: "+tiger.gender+'\n'+
				"Length of animal(in_cm) :: "+tiger.lenghtCm+'\n'+
				"Pedalism :: "+tiger.pedalism+'\n'+
				"Sound made by them :: "+tiger.sound+'\n'+
				"Type_of_Vore :: "+tiger.typeOfVore);
		
		System.out.println('\n'+"::  GIRAFFE  ::");//giraffe
		giraffe.gender="Male";
		giraffe.lenghtCm=550f;
		giraffe.pedalism=4;
		giraffe.sound="Hum";
		giraffe.typeOfVore="Herbivore";
		
		System.out.println("Gender :: "+giraffe.gender+'\n'+
				"Length of animal(in_cm) :: "+giraffe.lenghtCm+'\n'+
				"Pedalism :: "+giraffe.pedalism+'\n'+
				"Sound made by them :: "+giraffe.sound+'\n'+
				"Type_of_Vore :: "+giraffe.typeOfVore);
		
		System.out.println('\n'+"::  RETICULATED_PYTHON  ::");//reticulatedPython
		reticulatedPython.gender="Male";
		reticulatedPython.lenghtCm=767.5f;
		reticulatedPython.pedalism=0;
		reticulatedPython.sound="Hiss";
		reticulatedPython.typeOfVore="Carnivore";
		
		System.out.println("Gender :: "+reticulatedPython.gender+'\n'+
				"Length of animal(in_cm) :: "+reticulatedPython.lenghtCm+'\n'+
				"Pedalism :: "+reticulatedPython.pedalism+'\n'+
				"Sound made by them :: "+reticulatedPython.sound+'\n'+
				"Type_of_Vore :: "+reticulatedPython.typeOfVore);
		
		System.out.println('\n'+"::  KANGAROO  ::");//kangaroo
		kangaroo.gender="Male";
		kangaroo.lenghtCm=244.9f;
		kangaroo.pedalism=2;
		kangaroo.sound="Chortle";
		kangaroo.typeOfVore="Herbivore";
		
		System.out.println("Gender :: "+kangaroo.gender+'\n'+
				"Length of animal(in_cm) :: "+kangaroo.lenghtCm+'\n'+
				"Pedalism :: "+kangaroo.pedalism+'\n'+
				"Sound made by them :: "+kangaroo.sound+'\n'+
				"Type_of_Vore :: "+kangaroo.typeOfVore);

		System.out.println('\n'+"::  HUMAN_SAKURA  ::");//Sakura
		sakura.gender="Female";
		sakura.lenghtCm=172.5f;
		sakura.pedalism=2;
		sakura.sound="Talk";
		sakura.typeOfVore="Omnivore";
		
		System.out.println("Gender :: "+sakura.gender+'\n'+
				"Length of animal(in_cm) :: "+sakura.lenghtCm+'\n'+
				"Pedalism :: "+sakura.pedalism+'\n'+
				"Sound made by them :: "+sakura.sound+'\n'+
				"Type_of_Vore :: "+sakura.typeOfVore);
	}

}
