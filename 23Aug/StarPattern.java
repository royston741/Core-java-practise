/*
	Program: Program to print the following pattern
		 *
		 **
		 ***
		 ****
		 *****	
	@author: Royston
	@Date  : 23 August 
*/

// Creating a class named StarPattern
class StarPattern{

	// Creating printStarPattern method
	static void printStarPattern(){
		
		// printing the stars vertically
		for(int i=0;i<5;i++){
		// printing the stars horizontally			
			for(int j=0;j<=i;j++){
				System.out.print('*');
			}
			// next line
			System.out.println();
		}
	
	}

		
	// calling the main method	
	public static void main(String args[]){
		
		// calling printStarPattern
		printStarPattern();
		
	}
}
