/*
	Program: Print full form of abrivations
	@author: Royston
	@Date  : 22 August 
*/

// Declaring a class named AbrivationPrinter
class AbrivationPrinter
{	
	// Creating a method printAbrivationOf
	static void printAbrivationOf(String abrivation){
		
		// Switch case start 
		switch(abrivation){
			
			// if the case is asap 
			case "asap" ->System.out.println(abrivation+ " ---> As soon as possible."); 
			// if the case is approx 
			case "approx" ->System.out.println(abrivation+ " ---> Approximately. ");
			// if the case is dept
			case "dept" ->System.out.println(abrivation+ " ---> Department. "); 
			// if the case is est 
			case "est" ->System.out.println(abrivation+ " ---> Established. "); 
			// if the case is esp
			case "esp" ->System.out.println(abrivation+ " ---> Especially. "); 
			// if the case is not found
			default ->System.out.println("We don't have such a abrivation."); 
		
		// Switch case end
		}
		
		
	}
	
	// Calling the main method
	public static void main(String args[])
	{	
		// Storing the abrivation in a variable 
		String abrivation=args[0];
		
		// Calling the abrivation printer method and passing a argument
		printAbrivationOf(abrivation.toLowerCase());			
		
	}
}