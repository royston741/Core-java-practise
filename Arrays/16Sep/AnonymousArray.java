/*
	Program : Anonymous array
	@author : Royston
	@date : 16 September	
*/

// import scanner class
import java.util.Scanner;

// import all methods from system 
import static java.lang.System.*;

// Creating a class named AnonymousArray
class AnonymousArray
{	
	// Creating displayArray method
	static void displayArray(int...arr){
		out.print("The array is : ");
		// printing array 
		for(int i:arr){
			// printing array elements
			out.print(i+" ");
		}
	}

	// Caliing main method
	public static void main(String...args){
		// calling displayArray method and passing anonymous array 
		displayArray(new int[]{1,2,3,4,5,6});
		
	}// main method ends
	
	
}// class end
