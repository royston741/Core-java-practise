/*
	Program : Static vs instance variable
	@author : Royston
	@date : 22 Sep
*/

// import all methods from System
import static java.lang.System.*;

// creating a class Resident
class Resident{
	
	//instance variable
	private String name;
	private int age ;
	private String gender;
	private static String colony;
	static int counter;
	
	// no arguments constructor
	Resident(){}
	
	// parameterised constructor
	Resident(String name, int age,String gender){
		// initializing values
		this.name=name;
		this.age=age;
		this.gender=gender;
		// increment counter
		counter++;
		colony="Mathura";
	}
	
	//static method can acess only static variable and they can access instance variable through oject
	//non static method can access both static and non static variable	
	void display(){
		colony="ABC Colony";
		// print detials
		out.println("Name:   "+this.name +"  Age:  "+this.age+"  Gender:  "+this.gender+"  Colony:  "+colony);
	}
	
}// Resident class ends

// Creating Colony class
class Colony{
	
	// Calling main method
	public static void main(String...args){
		// Constructor injection
		Resident r1=new Resident("Roy",45,"male");
		out.println(r1.counter);
		Resident r2=new Resident("Som",23,"male");
		out.println(r2.counter);
		Resident r3=new Resident("Tom",32,"male");
		out.println(r3.counter);
		
		// printing details
		out.println("-----------------------------------------");
		//out.println(r1.counter);
		r1.display();
		out.println("-----------------------------------------");
		//out.println(r2.counter);
		r2.display();		
		out.println("-----------------------------------------");
		//out.println(r3.counter);		
		r3.display();
	}
}// Colony class ends