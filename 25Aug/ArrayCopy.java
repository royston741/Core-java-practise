/*
	Program: Cloning and copy in array
	@author: Royston
	@Date  : 25 August 
*/

/*--------
		shallow copy : copies only the reference
		deep copy    : copies the values 		
---------*/

// Creating a class named ArrayCopy
class ArrayCopy{
	
	// Creating createArray method
	static void createArray(int...orignalArr){
		
		// Creating a independent copy of the array (deep copy)
		int clone_array []=orignalArr.clone();
		
		// Copying the 
		int copied_array []=orignalArr;
		
		// changing the values of the orignal array
		for(int i=0;i<orignalArr.length;i++){
			orignalArr[i]+=2;
		}//If we change the value for orignalArr the copied_array value will also change

		
		// Printing the clone array 
		System.out.println("Clone array : ");
		for(int i:clone_array){
			System.out.print(i+" ");
		}		
		System.out.println();
		
	    // Printing the copied array 
		System.out.println("Copied array : ");
		for(int i:copied_array){
			System.out.print(i+" ");
		}
		System.out.println();
		
		//Comparing the arrays 
		System.out.println("clone_array is equal to orignalArr : "+(clone_array==orignalArr));
		System.out.println("copied_array is equal to orignalArr : "+(copied_array==orignalArr));

	}
	
	public static void main(String...args){
		int [] arr={1,2,3,4,5,6,7};
		// calling the createArray method and passing arr as argument
		createArray(arr);
	}
}

