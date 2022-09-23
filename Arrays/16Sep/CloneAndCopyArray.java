/*
	Program : Clone and copy array
	@author : Royston
	@date : 16 September	
*/

// import scanner class
import java.util.Scanner;

// import all methods from system 
import static java.lang.System.*;

// Creating a class named CloneAndCopyArray
class CloneAndCopyArray
{	
	// creating cloneArray method
	static void cloneArray(int...orignalArr){
		/*
			Clone means creating a independent copy so whenever we change the orignal array
			the cloned array will not get affected 
		*/
		// creating a clone of orignalArray
		int cloneArr[]=orignalArr.clone();
		// displaying clone array
		out.print("\nThe clone array is : ");
		displayArray(cloneArr);	
		// adding 2 to every element in orignalArray
		for(int i=0;i<orignalArr.length;i++){
			orignalArr[i]+=2;
		}
		out.println("\n--------- After adding 2 to orignalArray ---------");
		// display orignal array
		out.print("The orignal array  is : ");
		displayArray(orignalArr);
		// display clone array
		out.print("\nThe clone array is : ");
		displayArray(cloneArr);
	}
	
		// creating copyArray method
	static void copyArray(int...orignalArr){
		/*
			Copy means creating a copy refrence so whenever we change the orignal array
			the copy array will also get affected 
		*/
		
		// creating a copy of orignalArray
		int copyArr[]=orignalArr;
		// displaying copy array
		out.print("\nThe copy array is : ");
		displayArray(copyArr);	
		// adding 2 to every element in orignalArray
		for(int i=0;i<orignalArr.length;i++){
			orignalArr[i]+=2;
		}
		out.println("\n--------- After adding 2 to orignalArray ---------");
		// display orignal array
		out.print("The orignal array  is : ");
		displayArray(orignalArr);
		// display copy array
		out.print("\nThe copy array is : ");
		displayArray(copyArr);
	}
	
	// Creating displayArray method
	static void displayArray(int...arr){
		// printing array 
		for(int i:arr){
			// printing array elements
			out.print(i+" ");
		}
	}

	// Caliing main method
	public static void main(String...args){
		// array of type int 
		int arr[]={1,2,3,4,5,6};
		out.println(" -------------- CLONE -------------- ");
		// calling displayArray method and passing arr 
		out.print("The orignal array is : ");
		displayArray(arr);
		// calling cloneArray method
		cloneArray(arr);
		
		
		out.println("\n\n -------------- COPY -------------- ");
		// calling displayArray method and passing arr 
		out.print("The orignal array is : ");
		displayArray(arr);
		// calling copyArray method
		copyArray(arr);
		
	}// main method ends
	
	
}// class end
