/*
	Program : Nested switch
	@author : Royston
	@date : 12 September
*/

//import all methods from system class
import static java.lang.System.*;

// Creating a class named FindGreatest
class NestedSwitch
{	
	// Creating printFavouriteSport method 
	static void printFavouriteSport(String...arr){
		
		// storing the sport name in a variable
		String sport=arr[0].toLowerCase();
		
		// comparing the sport with cases
		switch(sport){
			// if football
			case "football" : // storing the role in a variable
							  String role=arr[1].toLowerCase();
							  // printing statement
							  out.println("I love Football.");
							  // comparing the role with cases
							  switch(role){
								  // if striker
								  case "striker" : // print statement
												   out.println("I am a Striker.");
												   break;
								 // if defender
								 case "defender": // print statement
												  out.println("I am Defender.");
				    		    				  break;
								 // default case 				  
								 default: out.println("I am all rounder.");						
							  } // end of role switch
							  break;
			// if boxing
			case "boxing" : out.println("I love Boxing.");
						      break;	
			// if basketball				  
			case "basketball" : out.println("I love Basketball.");
							    break;	
			// default case
			default: out.print("I dont't like sport");
		
		}// switch ends
		

	}
	
	//Calling main method
	public static void main(String...args){
	
		// Calling printFavouriteSport method
		printFavouriteSport(args);
	}
}
