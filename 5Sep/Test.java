/*
	Program : Printing hello world using java 
	@author : Royston
	@date : 5 September	
*/

/*
	public - access modifier (It is accessible anywhere) 
	static - allows us to call the method without creating a object of the class.
	void - return type (It will not return anything)
	String args [] - command line argument which is array of type string
*/

/*
// Creating a class named Test
class Test
{	

	// Caliing main method
	public static void main(String args[]){
	
		// print hello world
		System.out.println("Hello world");
		
		/*
			System - It is a class from java.lang package
			out - It is a static variable from System class of data type printStream
			println - Tt is the method 	
		*/
		
	}// main method
}// class end
*/

//  --------------------------------------- Test 1 -----------------------------------------

/*	
class Test{
		// If main method not present it will compile but throw run time error 
}
*/

//  --------------------------------------- Test 2 -----------------------------------------

// class Test{
		/*
			If public static is not present it will run during compile time but throw 
			an error during run time.
			error: 'main' method is not declared 'public static'
			------------------

			If void not written it will throw an error during compile time.
			invalid method declaration; return type required
                public static main(String args[]){
			------------------			
			
			If strinng , args not written compile time error
			------------------
			
			If [] not written run time error.
			------------------
			
			If public , static , void spelling is wrong it will be a compile time error.
			------------------
			
			String spelling wrong than compile time error
			------------------
			
			args can be written as anything
			------------------
		*/
		//public static void main(String args[]){
				
	//	}
	
//}


//  --------------------------------------- Test 3 -----------------------------------------

/*
class Test{	
	public static void main(int args[]){
		System.out.print("First main");
	}
	
	// main string args as parameter will run if we have two mains in same class 
	public static void main(String args[]){
		System.out.print("Second main");	
	}
}
*/


//  --------------------------------------- Test 4 -----------------------------------------

/*
	when there are 2 class in same .java file they will provide 2 class file when compiled
	and when we run it, it will execute the main from first class.
	--------------------------
	
	we can have mare than 1 class inside same file.
	--------------------------
	
*/

/*
class TestA{	
	public static void main(String args[]){
		System.out.print("First main");	
	}
}

class TestB{	
	public static void main(String args[]){
		System.out.print("Second main");	
	}
}
*/