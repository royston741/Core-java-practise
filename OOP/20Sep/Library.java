/* 
	Program : Creating a book library 
	@author : Royston
	@date : 20 Sep 
*/


//import scanner class
import java.util.Scanner;

// import all methods from system class 
import static java.lang.System.*;

//Creating a class named book
class Book{
	// properties of book 
	private String bookName,bookAuthorName;
	private int yearOfPublicatioin,bookId;
	private double bookPrice;
	
	// Creating inputBookDetials method
	void inputBookDetials(){
		//Creating scanner object
		Scanner sc=new Scanner(System.in);
		
		// Input book name
		out.print("\nEnter book name : ");
		bookName=sc.next();
		
		// Input book author name
		out.print("Enter book author name : ");
		bookAuthorName=sc.next();
		
		// Input book author id 
		out.print("Enter book author id : ");
		bookId=sc.nextInt();
		
		// Input book year of publicatioin
		out.print("Enter book year of publicatioin : ");
		yearOfPublicatioin=sc.nextInt();
		
		// Input book price 
		out.print("Enter book price : ");
		bookPrice=sc.nextDouble();
		
		// calling addBookDetails method
		addBookDetails(bookName,bookAuthorName,yearOfPublicatioin,bookPrice);

	}
	
	// Creating addBookDetails method
	void addBookDetails(String bookName,String bookAuthorName,int yearOfPublicatioin,double bookPrice){
		// initializing the variables
		this.bookName=bookName;
		this.bookAuthorName=bookAuthorName;
		this.yearOfPublicatioin=yearOfPublicatioin;
		this.bookPrice=bookPrice;
	}
	
	// printing book details
	void printBookDetails(){
		out.println("\n ------------ BOOK DETAILS -----------");
		// print book details
		out.println("The book id is : "+bookId);
		out.println("The book name is : "+bookName);
		out.println("The book author name is : "+bookAuthorName);
		out.println("The book year of publicatioin is : "+yearOfPublicatioin);
		out.println("The book price is : "+bookPrice);
	}
}

// Creating a class named library
class Library
{	
	// calling main method 
	public static void main(String...args){
		// Creating new book object b1
		Book b1=new Book();
		//calling inputBookDetials method for object b1 
		b1.inputBookDetials();
		// calling printBookDetails method for object b1 
		b1.printBookDetails();
		
		
		// Creating new book object b2
		Book b2=new Book();
		//calling inputBookDetials method for object b2 
		b2.inputBookDetials();
		// calling printBookDetails method for object b2 
		b2.printBookDetails();
	}
}