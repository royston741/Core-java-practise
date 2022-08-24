/*
	Program: Program on Arrays  
	@author: Royston
	@Date  : 23 August 
*/


	/*-----------
	   Array : - It is a collection of similar datatypes.
			   - It's index starts with index 0 and ends at array size - 1.
			   - Types : 1) One dimensional array - [1,2,3]
				     2) Two dimensional array - [[1,2,3],
								 [4,5,6]]
				     3) Multi dimensional array - [[1,2,3,4],
								   [5,6,7,8],
							           [9,10,11,12],...]
	 ------------*/

//Creating a class named ArrayDemo
class ArrayDemo{
	
	//Creating printArray method 
	static void printArray(int n1,int n2){
		// Declaring array
		
		System.out.println("--------- Method 1 ----------");
		// method 1 : declaring array and also providing memory to it 
		int [] arr1 = new int[3];   // array of size 3
		// Storing values in arr1 
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		// printing the elements of arr1 
		for(int i=0;i<arr1.length;i++){
			System.out.println("The element at index "+i+" of arr1 is : "+ arr1[i]);
		}
				
		System.out.println("--------- Method 2 ----------");
		// method 2 : declaring arrray and providing memory afterwords
		int [] arr2;
		arr2 = new int[2]; // providing memory
		// Storing values in arr1 		
		arr2[0]=n1;
		arr2[1]=n2;
		// printing the elements of arr2
		for(int i=0;i<arr2.length;i++){
			System.out.println("The element at index "+i+" of arr2 is : "+ arr2[i]);
		}
		
		// int [] arr=new int[3]; or int arr []=new int[3]; both are same
	}
	
	// Creating initArr method
	static void initArr(){
		
		System.out.println("--------- Integer Array ------------");
		// Provide array is implicit i.e it is provided in the program
		int arr []={1,2,3,22,4,9,5};
		// Print the length of an array
		System.out.println("The length of given array : "+arr.length);		
		// printing the elements of arr 
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n--------- String Array ------------");
		// String array 
		String strArr []={"Ram","Sham","Tom","Sam"};
		// printing the elements of strArr 
		for(int i=0;i<strArr.length;i++){
			System.out.print(strArr[i]+" ");
		}
		
		System.out.println("\n--------- Boolean Array ------------");
		// Boolean array : boolean =[true,false](it is a boolean) not ["true","false"] (it is a string)
		boolean boolArr []={true,false};  
		// printing the elements of boolArr
		for(int i=0;i<boolArr.length;i++){
			System.out.print(boolArr[i]+" ");
		}
		
	}
	
	// Creating a defMain method 
	static void defMain(){
			
		// There will be 2 array with 9 elements
		int [] arr1,arr2=new int[5];
		// int arr1 []
		// int arr2 []
			
		// Will throw a compile time error	
		// int a1[],a2=new int[5];
		// int a1[];
		// int a2;
	}
	
	// Calling main method 
	public static void main(String args[]){
		
		// Calling printArray method and passing two argument 
		printArray(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
		// Callig initArr method 
		initArr();
	}
}
