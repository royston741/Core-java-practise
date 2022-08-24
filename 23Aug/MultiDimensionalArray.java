/*
	Program: Program for multidimenssional array
	@author: Royston
	@Date  : 23 August 
*/

// Creating a class named MultiDimensionalArray
class MultiDimensionalArray{

	// Creating printMultiDimensionalArry method
	static void printMultiDimensionalArry(){
		
		// Creating a multidimenssional array 
		int [][] arr={  
				  // horizontal(column)
				 //    <-------->	^	
					  	{1,2,3}, // |
						{4,5,6}, // |  vertical(row)	
						{7,8,9}  // |
					 };
		
		System.out.println("printing the multidimenssional array using normal for loop");
		// printing it vertically i.e. rows	
		for(int i=0;i<arr.length;i++){
			// printing it horizontally i.e column
			for(int j=0;j<arr[i].length;j++){
				// printing the element at i(row) j(column)
				System.out.print(arr[i][j]+" ");
			}
			// printing on next line
			System.out.println();
		}			 
	
		
		// Enhanced for loop 
		System.out.println("printing the multidimenssional array using Enhanced for loop");
		// printing it vertically i.e. rows	
		for(int [] rowElement:arr){
			// printing it horizontally i.e column			
			for(int colElement:rowElement){
				// printing the element at i(row) j(column)
				System.out.print(colElement+ " " );				
			}
			// printing on next line
			System.out.println();
		}			 
	
	}
		
	// calling the main method	
	public static void main(String args[]){
		
		// calling printMultiDimensionalArry
		printMultiDimensionalArry();
		
	}
}