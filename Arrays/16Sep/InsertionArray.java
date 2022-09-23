/*
	Program : Inserting elements in an array
	@author : Royston
	@date : 16 Sep
*/

// importing scanner class
import java.util.Scanner;

// importing all methods from system
import static java.lang.System.*;

// Creating InsertElement class
class InsertElement{
	
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
		out.print("Enter the number to be inserted : ");
		int num=sc.nextInt();
		
		// Taking position input
		out.print("Enter the position : ");
		int pos=sc.nextInt();
		
		// caliing insertElement method
		insertElement(num,pos,arr);
	}
	
	// Creating insertElement method
	static void insertElement(int num,int pos,int...arr){		
		//length of the arr
		int size= arr.length;
		// creating  a new array of size +1  
	    int myArray[] = new int[size+1];
			
		for(int i=0;i<pos-1;i++){
			myArray[i]= arr[i];
		}
		// inserting the element 
		myArray[pos-1]=num;
		 // adding the remaining elements 
		for(int i=pos;i<size+1;i++){
			 myArray[i]= arr[i-1];
		}
		
		// displaying the array 
	    System.out.print("Array after insertion : " );
		displayArray(myArray);
	   
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
