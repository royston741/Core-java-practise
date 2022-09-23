/*
	Program : Jagged array - no. of columnns in every row is not equal
	@author : Royston
	@date : 16 September	
*/

// import scanner class
import java.util.Scanner;

// import all methods from system 
import static java.lang.System.*;

// Creating a class named JaggedArray
class JaggedArray
{
	// creating createArray method
	static void createArray(){
		// creating a scanner object
		Scanner sc=new Scanner(System.in);
		
		// Creating a array 
		int [][] arr=new int[3][];
		// providing column size
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[4];
		
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
	
	// Creating display method
	static void displayArray(int arr[][]){
		out.println("The jagged array is : ");
		// printing array rows
		for(int []i:arr){
		// printing array column
			for(int j:i){
			// printing array column
				out.print(j+" ");
			}
			//next line
			out.println();
		}
	}


	// calling main method
	public static void main(String...args){
		// calling createArray method
		createArray();
	}
}