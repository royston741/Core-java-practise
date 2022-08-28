/*
	Program: Scanner delimeter
	@author: Royston
	@Date  : 24 August 
*/

// delimiters are the characters that split (separate) the string into tokens

// import all the  method from system
import static java.lang.System.*;

// import scanner class
import java.util.Scanner;

// creating a class named delimeterScanner
class delimeterScanner{
	
	//Creating delimeter method
	static void delimeter(){
		String str="I am a boy";
		// Creating a new scanner object 
		Scanner sc=new Scanner(str);
		// white space for words  
		sc.useDelimiter(" ");
		
		// while there are words print
		while(sc.hasNext()){
			out.println(sc.next());
		}
		
	}

	// calling main method
	public static void main(String args[]){
		// Calling delimeter method
		delimeter();
	}
}