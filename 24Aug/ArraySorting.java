/*
	Program: Array sorting
	@author: Royston
	@Date  : 24 August 
*/


// creating a class named ArraySorting
class ArraySorting{
	
	// Creating a printArray method and passing array as an argument 
	static void printArray(String...arr){
		// storing the size of the array
		int size=arr.length;
		// Creating a new array 
		int [] newArr = new int[size];
		
		// converting all the elements of orignal array and storing it into a new array  
		for(int i=0;i<size;i++){
			newArr[i]=Integer.parseInt(arr[i]);
		}
		
		// printing the orignal array
		System.out.print("The orignal array is : ");
		for(int i=0;i<size;i++){
			System.out.print(newArr[i]+" ");
		}
		
		System.out.println();
		// Calling a sortArray method and passing size and array as argumenta 
		sortArray(size,newArr);
	}
	
	// Creating a sortArray method and passing array size and array as an argument 
	static void sortArray(int size,int...arr){
		
		// taking the element of the array one by one 
		for(int i=0;i<size;i++){
			// than comparing the i element with every element in the array
			for(int j=i;j<size;j++){
				// if the i element is greater hhan j element
				if(arr[i]>arr[j]){
					
					// Swapping
				/*	
					// method 1
					//  a=a+b  a=10+5 i.e a=15
					arr[i]+=arr[j];
					// b=a-b  b=15-5 1.e. b=10
					arr[j]=arr[i]-arr[j];
					// a=a-b  a=15-10 i.e a=5
					arr[i]-=arr[j];
				*/	
					// method 2
					int temp;
					// storing value in 
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		// printing the sorted array 
		System.out.print("The sorted array is : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
		
		// print largest number 
		System.out.println();
		System.out.println("The largest number is : " +arr[arr.length-1]);
		
		// print second largest number
		System.out.println("The largest number is : " +arr[arr.length-2]);
		
	}    


	// calling main method
	public static void main(String args[]){
		//sortArray(1,5,9,3,4,2,8);
		
		// calling printArray method and passing args as argument
		printArray(args);
			
	}
}