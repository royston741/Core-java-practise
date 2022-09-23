/*
	Program : remove duplicate elements in an array
	@author : Royston
	@date : 16 September	
*/

// import scanner class
import java.util.Scanner;

// import all methods from system 
import static java.lang.System.*;

// Creating a class named RemoveDuplicateArray
class RemoveDuplicateArray
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
		removeDuplicateElements(arr);
	}	
	
	// Creating removeDuplicateElements method
	static void removeDuplicateElements(int myArray[]){
		// storing array size
	   int size= myArray.length;
	   int new_size;
	   // if array length is 0 or 1
	   if(size==0||size==1)
		   new_size=size;
	   // temporary array
	   int temp[] = new int[size];
	   int j=0;
	   for(int i=0;i<size-1;i++)
	   {
		   if(myArray[i]!=myArray[i+1])
		   {
			   temp[j++]=myArray[i];
		   }
	   }
	   temp[j++]=myArray[size-1];
	   
	   //changing original array
	   for(int i=0; i<j;i++)
	   {
		   myArray[i]= temp[i];
	   }
	   // display duplicate
	   displayArray(temp);
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