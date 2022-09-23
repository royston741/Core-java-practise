/*
	Program : operations on 2d array
	@author : Royston
	@date : 16 September	
*/

// import scanner class
import java.util.Scanner;

// import all methods from system 
import static java.lang.System.*;

// Creating a class named MatrixOperations
class MatrixOperations
{		
	// creating inputArray method
	static void inputArray(){
		// Creating a scanner object
		Scanner sc= new Scanner(System.in);  
		
		// Creating a array arr1
		int [][] arr1=new int[3][3];
		
		// Input elements
		out.println("Enter the elements of first array : ");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				arr1[i][j]=sc.nextInt();
			}
		}
		
		// Creating a array arr2
		int [][] arr2=new int[3][3];
		
		// Input elements
		out.println("Enter the elements of second array : ");
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				arr2[i][j]=sc.nextInt();
			}
		}
		// calling chooseMatrixOperation
		chooseMatrixOperation(arr1,arr2);
	}
	
	// Creating chooseMatrixOperation method
	static void chooseMatrixOperation(int arr1[][],int arr2[][]){
		// Creating a scanner object
		Scanner sc= new Scanner(System.in);  
		//Take choice input 
		out.println("Enter your choice (add,sub,mul) : ");
		String choice=sc.next();
		// comparing choices with case
		switch(choice){
			// case addition
			case "add"->addMatrix(arr1,arr2);
			// case substraction
			case "sub"->substractMatrix(arr1,arr2);
			// case multiplication
			case "mul"-> multiplicationMatrix(arr1,arr2);
			// wrong input 
			default->out.println("Wrong input");
		}// switch ends
	
	}

	
	// Creating addMatrix method
	static void addMatrix(int arr1[][],int arr2[][]){
		// array of 3 column and 3 rows
		int resultArr[][]=new int[3][3];
		
		// loop for rows
		for(int i=0;i<3;i++){
			// loop for colums
			for(int j=0;j<3;j++){
				//adding elements of arr1 and arr2 and storing into resultArr
				resultArr[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		// display array after operation
		out.println("The addition of the 2 matrix is :");
		displayArray(resultArr);
	}
	
	// Creating substractMatrix method
	static void substractMatrix(int arr1[][],int arr2[][]){
		// array of 3 column and 3 rows
		int resultArr[][]=new int[3][3];
		
		// loop for rows
		for(int i=0;i<3;i++){
			// loop for colums
			for(int j=0;j<3;j++){
				//substract elements of arr1 and arr2 and storing into resultArr
				resultArr[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
		// display array after operation
		out.println("The substraction of the 2 matrix is :");
		displayArray(resultArr);
	}
	
	// Creating multiplicationMatrix method
	static void multiplicationMatrix(int arr1[][],int arr2[][]){
		// array of 3 column and 3 rows
		int resultArr[][]=new int[3][3];
		
		// loop for rows
		for(int i=0;i<3;i++){
			// loop for colums
			for(int j=0;j<3;j++){
				//multiply elements of arr1 and arr2 and storing into resultArr
				resultArr[i][j]=arr1[i][j]*arr2[i][j];
			}
		}
		// display array after operation
		out.println("The multiplication of the 2 matrix is :");
		displayArray(resultArr);
	}
	
	// Creating displayArray method
	static void displayArray(int arr[][]){
		out.println("The array is : ");
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
		// calling inputArray method
		inputArray();
	}
}