/*
	Program : Find the greatest number from 2 number 
	@author : Royston
	@date : 9 September
*/

//import all methods from system class
import static java.lang.System.*;

// Creating a class named FindGreatest
class FindGreatest
{	
	// Creating method to find greatest number
	static void printGreatestNumber(String...arr){
		
		// storing the inputs into variable and parsing
		int num1=Integer.parseInt(arr[0]);	
		int num2=Integer.parseInt(arr[1]);
		
		// if num1 is equal to num2
		if(num1==num2){
			out.println("The number "+num1 +" is equal to number "+num2);
		}
		// if num1 is greater than num2
		else if(num1>num2){
			out.println("The number "+num1 +" is greater than number "+num2);
		}
		// if num2 is greater than num1 
		else{
			out.println("The number "+num1 +" is less than number "+num2);
		}
	}
	
	//Calling main method
	public static void main(String...args){
	
		// Calling printGreatestNumber method
		printGreatestNumber(args);
	}
}
