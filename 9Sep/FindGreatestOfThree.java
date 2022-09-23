/*
	Program : Find the greatest number from 2 number 
	@author : Royston
	@date : 9 September
*/

//import all methods from system class
import static java.lang.System.*;

// Creating a class named FindGreatest
class FindGreatestOfThree
{	
	// Creating method to find greatest number
	static void printGreatestNumber(String...arr){
		
		// storing the inputs into variable and parsing
		int num1=Integer.parseInt(arr[0]);	
		int num2=Integer.parseInt(arr[1]);
		int num3=Integer.parseInt(arr[2]);
		
		// if num1 is equal to num2
		if((num1==num2)&&(num1==num3)){
			out.println("All the number are equal to number ");
		}
		// if num1 is greater than num2 and num3
		else if((num1>num2)&&(num1>num3)){
			out.println("The greatest number "+num1);
		}
		// if num2 is greater than num1 and num3
		else if((num2>num1)&&(num2>num3)){
			out.println("The greatest number "+num2);
		}
		// if num3 is greater than num1 and num2
		else{
			out.println("The greatest number is "+num3);
		}
		
	}
	
	//Calling main method
	public static void main(String...args){
	
		// Calling printGreatestNumber method
		printGreatestNumber(args);
	}
}
