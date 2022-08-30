/*
	Program: add elements of an array
	@author: Royston
	@Date  : 26 August 
*/

// Creating a class named ArraySum
class ArraySum{
	
	// Creating addArray method
	static void addArray(String...arr){
		//Storing the size of arr
		int size=arr.length;
		//Creating a newArr
		int newArr []=new int[size];

		//Converting all the elements of arr to type int and storing them into newArr	
		for(int i=0;i<size;i++){
			newArr[i]=Integer.parseInt(arr[i]);
		}
		
		//Creating a variable sum
		int sum=0;
		//Adding all the values of newArr into sum
		for(int i:newArr){
			sum+=i;
		}
		//Printing the sum
		System.out.print(sum);
	}
	
	//Calling main method
	public static void main(String...args){
		//Calling addArray method and passing args as arguments
		addArray(args);
	}

}