/*
	Program : Deleting elements of the array
	@author : Royston
	@date : 16 Sep
*/

// importing scanner class
import java.util.Scanner;

// importing all methods from system
import static java.lang.System.*;

// Creating DeleteArray class
class DeleteArray{
	
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
		
		// Taking delete number input
		out.print("Enter the number to be deleted : ");
		int num=sc.nextInt();
		
		// caliing delElement method
		delElement(num,arr);
	}
	
	// Creating delElement method
	static void delElement(int num,int...arr){
		// isPresent variable 
		boolean isPresent=false;
		// position variable
		int pos =0;
		// loop to find the elemnt
		for(int i=0;i<arr.length;i++){
			// if present
			if(arr[i]==num){
				// set isPresent true
				isPresent=true;
				// set the position
				pos=i;
				// come out of the loop 
				break;	
			}
		}
		
		// if number present
		if(isPresent){
			//run a loop from the number which is next to the number to be deleted
			for(int i=pos+1;i<arr.length;i++){
				//than replace the number with the next number
				arr[i-1]=arr[i];
			}
		}
		// display array after deleting 
		out.println("Elements after deleting : ");
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
