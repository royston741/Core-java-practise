/*
	Program : Traversing the array
	@author : Royston
	@date : 16 Sep
*/

// importing scanner class
import java.util.Scanner;

// import Arrays 
import java.util.Arrays;

// importing all methods from system
import static java.lang.System.*;

// Creating TraverseArray class
class TraverseArray{
	
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
		
		// calling  displayArray method
		displayArray(arr);
		
	}
	

	
	// Creating displayArray method
	static void displayArray(int...arr){
		// printing array 
		for(int i:arr){
			// printing array elements
			out.print(i+" ");
		}
	}
	
	// Calling main method
	public static void main(String...args){
		// caliing inputArray method
		inputArray();
	}
}
