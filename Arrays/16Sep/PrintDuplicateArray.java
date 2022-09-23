/*
	Program : printing duplicate elements in an array
	@author : Royston
	@date : 16 September	
*/

// import scanner class
import java.util.Scanner;

// import all methods from system 
import static java.lang.System.*;

// Creating a class named PrintDuplicateArray
class PrintDuplicateArray
{
	
	// Creating inputArray method
	static void inputArray(){
		// Creating a scanner object
		Scanner sc= new Scanner(System.in); 
		
		// Taking row input
		out.print("Enter the number of elements : ");
		int size=sc.nextInt();
		
		// creating an array
		int []arr=new int[size];
		
		// Input elements
		out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		// calling display method
		out.println("Orignal array : ");
		displayArray(arr);
		//calling printDuplicateElements method
		out.println("\nDuplicate elements are : ");
		printDuplicateElements(arr);
	}	
	
	// Creating printDuplicateElements method
	static void printDuplicateElements(int arr[]){
		// loop for selecting i
	   for(int i=0; i<arr.length;i++){
		   // loo for selecting j
		   for(int j=i+1;j<arr.length;j++){
			   // if element at position i is equal to element at position j
			   if(arr[i]==arr[j])
				   // print the element
				   System.out.print(arr[i]+ "  ");
		   }
		   
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

	//calling main methods
	public static void main(String...args){
		// calling inputArray methods
		inputArray();
	}
}	