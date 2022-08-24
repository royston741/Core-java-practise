/*
	Program: Matrix addition
	@author: Royston
	@Date  : 23 August 
*/

// importing scanner class
import java.util.Scanner;

// creating a class named MatrixAddition
class MatrixAddition{
	
	// creating addMatrix method
	static void addMatrix(){
		// Creating a new scanner object
		Scanner sc=new Scanner(System.in);
	
		// matrix 1
		int [][] matrix1={{1,2,3},
						{4,5,6}};
		// matrix 2						
		int [][] matrix2={{1,2,3},
						{4,5,6}};					 
		
		int [][] resultMatrix=new int[2][3];
		
		// traversiong through the matrix
		for(int i=0;i<matrix1.length;i++){
			for(int j=0;j<matrix1[i].length;j++){
				// adding matrix1 and matrix2
				resultMatrix [i][j]=matrix1[i][j]+matrix2[i][j];
				//printing resultMatrix
				System.out.print(resultMatrix[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
	// calling main method
	public static void main(String args[]){
		// calling addMatrix method
		addMatrix();
	}
}