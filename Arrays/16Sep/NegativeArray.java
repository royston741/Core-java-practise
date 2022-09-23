/*
	Program : Printing negative elements of the array
	@author : Royston
	@date : 16 Sep
*/

// importing scanner class
import java.util.Scanner;

// importing all methods from system
import static java.lang.System.*;

// Creating NegativeArray class
class NegativeArray{
	
	// Creating inputArray method
	static void inputArray(){
		// Creating a scanner object
		Scanner sc= new Scanner(System.in); 
		
		// Taking size input
		out.print("Enter the number of elements : ");
		int size=sc.nextInt();
		
		// creating an array
		int []arr=new int[size];
		
		// Input elements
		out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		// caliing displayNegativeElements method
		out.println("The negative elements are : ");
		displayNegativeElements(arr);
	}
	
	
	// Creating displayArray method
	static void displayNegativeElements(int...arr){
		// printing array 
		for(int i:arr){
			// if less than 0
			if(i<0){
				// printing array elements
				out.print(i+" ");
			}
		}
	}
	// Calling main method
	public static void main(String...args){
		// caliing inputArray method
		inputArray();
	}
}
