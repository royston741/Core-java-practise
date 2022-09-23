/*
	Program : varargs 	
	@Author : Royston
	@date : 23 September			  
*/

// import all the methods from System
import static java.lang.System.*;

// Creating VarArgs class
class VarArgs{
	// ------------------- METHOD OVERLOADING --------------------
	// We can have method with same name but they should have different parameter 
	
	// Creating printArray method for empty
	static void printArray(){
		out.println("---------- EMPTY ------------");	
	}
	
	// Creating printArray method for integer argument
	static void printArray(int...arr){
		out.println("---------- INTEGER ------------");	
	}
	
	// Creating printArray method for float argument
	static void printArray(float...arr){
		out.println("---------- FLOAT ------------");	
	}
	
		// Creating printArray method for string argument
	static void printArray(String...arr){
		out.println("---------- STRING ------------");	
	}
	
	// calling main method
	public static void main(String...args){
		// calling int printArray
		printArray(1,2,3,5,4);
		// calling float printArray
		printArray(1,2,3,5.0f,4.0f);
		// calling float printArray
		printArray("Tom","Sam");
		
		printArray();// ambigious --> empty parameter 
	} //main method ends 
	
}// Bank class ends  