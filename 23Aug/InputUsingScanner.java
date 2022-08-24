/*
	Program: Taking input using scanner class
	@author: Royston
	@Date  : 23 August 
*/

// importing scanner class
import java.util.Scanner;

// creating a class named InputUsingScanner
class InputUsingScanner{
	
	// creating takeInput method
	static void takeInput(){
		// Creating a new scanner object
		Scanner sc=new Scanner(System.in);
		
		// Taking string as input 
		System.out.print("Enter your full name : ");
		String name=sc.nextLine();
		System.out.println("The entered name is : "+ name);
		
		System.out.print("Enter place : ");
		// next() method takes only the first word of a string 
		String place=sc.next();
		System.out.println("The entered place is : "+ place);
		
		// Taking charater as input 		
		System.out.print("Enter country : ");	
		char firstLetter=sc.next().charAt(2);	
		System.out.println("The first letter of entered country is : "+ firstLetter);
		
		// Taking integer as input
		System.out.print("Enter age : ");
		int age=sc.nextInt();
		System.out.println("The entered age is : "+ age);
			
		// Taking float as input
		System.out.print("Enter marks : ");
		float marks=sc.nextFloat();
		System.out.println("The entered marks is : "+ marks);
				
		
		// Creating a array 
		int [] arr=new int[5];
		System.out.println("Enter array elements : ");
		// Taking elements as input
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		// Enhanced loop cannot be used to take in contrast to above e.g.
		// printing arr
		System.out.print("The array elements : ");
		for(int element:arr){
			System.out.print(element+" ");
		}
		
	}
	
	// calling main method
	public static void main(String args[]){
		// calling takeInput method
		takeInput();
	}
}