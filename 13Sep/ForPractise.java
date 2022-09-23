/*
	program : java practise for loop
	@author : Royston
	@date : 13 September	
*/

// import all methods from System class
import static java.lang.System.*;

// Creating a class named ForPractise
class ForPractise{
	/* 
		*
		* 
        * 	
	*/	   
	// Creating a printStar method
	static void printStar(int num){
		// running the loop
		for(int i=0;i<num;i++){
			//printing the *
			out.println("*");
		}
		
	}
	
	/* 
		*
		* *	
        * * *
	*/	   
	// Creating a printStarPattern method
	static void printStarPattern(int num){
		// printing the row 
		for(int i=0;i<num;i++){
			// printing the column
			for(int j=0;j<i;j++){
				out.print("* ");
			}
			// next line
			out.println();
		}
	}
	
	/*
	   * * *
	   * *
	   *		
	*/
	// Creating a printReverseStarPattern method
	static void printReverseStarPattern(int num){
		// printing the row 
		for(int i=num;i>0;i--){
			// printing the column
			for(int j=i;j>0;j--){
				out.print("* ");
			}
			// next line
			out.println();
		}
	}
	
	/*
	
	*
	* *
	* * *
	* *
	*
	
	*/
	// Creating arrowStarpattern method
	static void arrowStarpattern(int num){
		
		/* for *
			   * *	
			   * * *
		*/	   
		//  print the rows 
		for(int i=1;i<=num;i++){
			// next line
			out.println();
			// print the colums in increasing order
			for(int j=1;j<=i;j++){
				out.print("* ");
			}
		}
		
		/* for * * *
			   * *
			   *		
		*/
		// print the rows 
		for(int i=1;i<=num;i++){
			// next line 
			out.println();
			// print the colums in decreasing order
			for(int j=num-i;j>0;j--){
				out.print("* ");
			}
		}
		
	}
	
	// calling main method
	public static void main(String...args){
		// taking a input 
		int number =Integer.parseInt(args[0]);
		
		// calling printReverseStarPattern method and passing argument
		//printReverseStarPattern(number);
		arrowStarpattern(number);
	}

}