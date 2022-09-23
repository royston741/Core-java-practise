/*
	Program : Sort elements of the array
	@author : Royston
	@date : 16 Sep
*/

// importing scanner class
import java.util.Scanner;

// import Arrays 
import java.util.Arrays;

// importing all methods from system
import static java.lang.System.*;

// Creating SortArray class
class SortArray{
	
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
		
		// calling sortArray method 
		sortArray(arr);
		
	}
	
	// Creating a class named printPattern
	static void sortArray(int...arr){
		/*
		// first taking i element
		for(int i=0;i<arr.length;i++){
			// comparing i element with all the element in the array
			for(int j=i;j<arr.length;j++){
				// if i element is greater than j swap their position 
				if(arr[i]>arr[j]){
					//Swapping
					// a=a+b  a=10+5 i.e a=15
					arr[i]+=arr[j];
					// b=a-b  b=15-5 1.e. b=10
					arr[j]=arr[i]-arr[j];
					// a=a-b  a=15-10 i.e a=5
					arr[i]-=arr[j];
				}  // closing the if check
				
			} //closing the j loop
			
		} // clossing the i loop
		*/
		
		// sort method from arrays 
		Arrays.sort(arr);	
		
		// printing sorted array
		out.println("The sorted array is ");
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
