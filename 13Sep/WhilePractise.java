/*
	program : java practise while loop
	@author : Royston
	@date : 13 September	
*/

// import all methods from System class
import static java.lang.System.*;

// Creating a class named WhilePractise
class WhilePractise{
	
	// Creating a bulb method
	static void bulb(int durablity){
		// checking the status
		while(durablity>=10){
			// printing the status
			out.println("The durablity of the bulb is : "+ durablity);
			// decrementing the status
			durablity-=5;
		}
		
		// if the status is less than 10 the bulb is off	
		if(durablity<10){
			// the bulb is off
			out.println("The bulb is OFF");
		}
	}
	
	// creating a bulb2 method
	static void bulb2(int durablity){
		
		// first exectute the code
		do{
			// print the durablity
			out.println("The durablity of the bulb is : "+ durablity);
			// decrement the durablity
			durablity-=5;
		}while(durablity>=10); // check the condition
		
		// if the status is less than 10 the bulb is off	
		if(durablity<10){
			out.println("The bulb is OFF");
		}
	}
	
	// calling main method
	public static void main(String...args){
		// taking a input 
		int durablity =Integer.parseInt(args[0]);
		
		// calling printReverseStarPattern method and passing argument
		bulb2(durablity);
	}

}