/*
	Program : 2D Array 
	@author : Royston
	@date : 16 September	
*/

// import scanner class
import java.util.Scanner;

// import all methods from system 
import static java.lang.System.*;

// Creating a class named ArrayDemo
class ArrayDemo
{	
	// Creating createArray method
	static void createArray(){
		// Creating a scanner object
		Scanner sc= new Scanner(System.in);  
		
		// Taking row input
		out.print("Enter the number of rows : ");
		int rows=sc.nextInt();
		
		// Taking column input 
		out.print("Enter the number of columns : ");
		int cols=sc.nextInt();
		
		// Creating a array 
		int [][] arr=new int[rows][cols];
		
		// Input elements
		out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		// calling display method
		displayArray(arr);
	}
	
	// Creating displayArray method
	static void displayArray(int [][]arr){
		out.println("The array is : ");
		// printing array rows
		for(int i[]:arr){
		// printing array column
			for(int j:i){
			// printing array column
				out.print(j+" ");
			}
			//next line
			out.println();
		}
	}

	// Caliing main method
	public static void main(String...args){
		// calling createArray method
		createArray();
		
	}// main method ends
	
	
}// class end
