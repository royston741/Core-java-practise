/*
	Program : Updating elements in an array
	@author : Royston
	@date : 16 Sep
*/

// importing scanner class
import java.util.Scanner;

// importing all methods from system
import static java.lang.System.*;

// Creating UpdateElement class
class UpdateElement{
	
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
		
		// Taking insert number input
		out.print("Enter the number to be updated : ");
		int num=sc.nextInt();
		
		// Taking position input
		out.print("Enter the new value : ");
		int newVal=sc.nextInt();
		
		// caliing updateElement method
		updateElement(num,newVal,arr);
	}
	
	// Creating pdateElement method
	static void updateElement(int oldVal,int newVal,int...arr){		
		// isPresent variable 
		boolean isPresent=false;
		// position variable
		int pos =0;
		// loop to find the elemnt
		for(int i=0;i<arr.length;i++){
			// if present
			if(arr[i]==oldVal){
				// set isPresent true
				isPresent=true;
				// set the position
				pos=i;
				// come out of the loop 
				break;	
			}// if ends 
		}// for ends	
		
		// if element is present
		if(isPresent){
			// insert the new element at pos
			arr[pos]=newVal;
			// print updated array
			out.print("Updated Array :");
			displayArray(arr);
		}
		// if element not found 
		else{
			out.println("Element not found ");
		}	
	   
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
