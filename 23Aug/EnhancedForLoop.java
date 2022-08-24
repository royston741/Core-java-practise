/*
	Program: Program to print elements of an a anonymous array using enhanced for loop 
	@author: Royston
	@Date  : 23 August 
*/

//Anonymous array: array without any name 
// new String{[]{1,2,3,5,4}

// Creating a class named EnhancedForLoop
class EnhancedForLoop{
	
	//Creating method for printing colors
	static void printColors(String colors []){
		
		// Printing colors from the provided array using enhanced for loop
		for(String color:colors){
			System.out.println(color);		
		}
	}
	
	// Calling the main method 
	public static void main(String args []){
		
		// calling the printColors method and passing a anonymous array as a argument 
		printColors(new String[]{"red","blue","green","yellow","black"});
	}
}