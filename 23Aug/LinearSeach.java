/*
	Program: Program for checking that the provided number is present or not 
	@author: Royston
	@Date  : 23 August 
*/

// Creating a class named LinearSearch
class LinearSearch{
	
	// Creating a method searchNumber
	static void searchNumber(int num){
		
		// provided Array
		int [] arr={1,3,6,2,76,7,9,12,45};
		
		// set isPresent in the array to false 
		boolean isPresent=false; 
		
		// Traversing through arr
		for(int i=0;i<arr.length;i++){
			// if the array element is equal to the number
			if(num==arr[i]){
				// print the element and its index
				System.out.println("The number "+num+" is present at index. "+ i);	
				// set isPresent to true 
				isPresent=true;
				break;  // Come out of the loop
			}
		}
		
		// if not present in the array
		if(!isPresent){
			System.out.println("The number "+num+" is not present. ");
		}		
	}
	
	// Calling the main method	
	public static void main(String args []){
		
		// calling searchNumber method and passing a argument
		searchNumber(Integer.parseInt(args[0]));
	}
}