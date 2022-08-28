/*
	Program: Varargs
	@author: Royston
	@Date  : 24 August 
*/


// creating a class named VarArgs
class VarArgs{
		
	// Creating printNum method for type int							
	static void printNum(int...x){// using ellipse operator to get any number of arguments
		// printing the elements from x
		for(int i:x){ 
			System.out.println(i);
		}
	}
		
	// we cannot have more than one varargs it will provide a compile error
     /* static void printNum(int...x,int...x){// using ellipse operator to get any number of arguments
		// printing the elements from x
		for(int i:x){
			System.out.println(i);
		}
	} */
	
	// varargs must be last parameter
	/* static void printNum(float...x,int i){// using ellipse operator to get any number of arguments
		// printing the elements from x
		for(float i:x){
			System.out.println(i);
		}
	} */
	
	// Creating printNum method for type float 
	static void printNum(float...x){// using ellipse operator to get any number of arguments
		// printing the elements from x
		for(float i:x){
			System.out.println(i);
		}
	}
	
	// Creating printNum method for type String
	static void printNum(String...x){// using ellipse operator to get any number of arguments
		// printing the elements from x
		for(String i:x){
			System.out.println(i);
		}
	}
	
	
	// calling main method
	public static void main(String args[]){
		// calling printNum for type int
		printNum(1,2,3,4,5,6,7);
		
		// calling printNum for type float
		printNum(1,2,3,4,5,6,7.1f);
		
		// calling printNum for type int
		printNum("Ram","Sham","Tom");
	}
}