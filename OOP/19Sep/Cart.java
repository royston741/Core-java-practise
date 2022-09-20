/*
	Program : Shopping cart for book 
	@author : Royston
	@Date : 20 Sep
*/

//import scanner class
import java.util.Scanner;

// import all methods from system class 
import static java.lang.System.*;

//Creating a class named book
class Book{
	
	// properties of book 
	private String bookName,bookAuthorName;
	private int yearOfPublicatioin;
	private double bookPrice;
	
	// method to get the book price 
	double getBookPrice(){
		return bookPrice;
	}
	
	// Creating inputBookDetials method
	void inputBookDetials(){
		//Creating scanner object
		Scanner sc=new Scanner(System.in);
		
		// Input book name
		out.print("\nEnter book name : ");
		bookName=sc.nextLine();
		
		// Input book author name
		out.print("Enter book author name : ");
		bookAuthorName=sc.nextLine();
		
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
		// print book details
		out.println("The book name is : "+bookName);
		out.println("The book author name is : "+bookAuthorName);
		out.println("The book year of publicatioin is : "+yearOfPublicatioin);
		out.println("The book price is : "+bookPrice);
	}
}

// Creating a class named Cart
class Cart
{	// total price variable 
	static double totalPrice=0;
	
	// add to cart method
	static void addToCart(){
		// wantToBuy variable
		boolean wantToBuy=true;
		// item no variable
		int itemNo=0;
		// array of object
		Book item[]=new Book[100];
		// Creating a new scanner object
		Scanner sc=new Scanner(System.in);
		
		// whilw want ot buy run the loop
		while(wantToBuy){
			// Take choice input 
			out.print("\nDo you want to add a book y/n : ");
			char choice=sc.next().toLowerCase().charAt(0);
			// if choice is no 
			if(choice=='n'){
				// set wantToBuy as false
				wantToBuy=false;
				// come out of the loop
				break;
			}
			// create a new book 	
			item[itemNo]=new Book();
			//calling inputBookDetials method
			item[itemNo].inputBookDetials();
			// add book price to total  price
			totalPrice+=item[itemNo].getBookPrice();
			// increment item no 
			itemNo++;
		}
		
	}	
	

	// calling main method 
	public static void main(String...args){
		
		// calling add to cart method
		addToCart();
		
			
	}
}