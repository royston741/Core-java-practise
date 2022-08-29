/*
	Program: Creating a book class  
	@author: Royston
	@Date  : 29 August 
*/
	
// importing all method from system class
import static java.lang.System.*;

//Creating a class named book 
class Book
{
	// instance variables
	String bookName;
	String bookAuthor;
	int bookPrize;
	int bookRating;
	int bookPages;
	
	// creating getBookData method
	void getBookData(){
		// printing book data
		out.println("Book name : "+bookName);
		out.println("Book author : "+bookAuthor);		
		out.println("Book prize : "+bookPrize+"$");
		out.println("Book rating : "+bookRating);
		out.println("Book pages : "+bookPages);
	}
	
	// Creating inputDetails method
	void inputDetails(String book_name,String book_author,int book_prize,int book_rating,int book_pg){
		// initializing values
		bookName=book_name;
		bookAuthor=book_author;
		bookPrize=book_prize;
		bookRating=book_rating;
		bookPages=book_pg;
	}
	
	//calling main method
	public static void main(String...args){
		// creating new book object
		Book b1=new Book();
		
		// initializing values
		/*
		b1.bookName="Harry potter";
		b1.bookAuthor="Royston";
		b1.bookPrize=20;
		b1.bookRating=5;
		b1.bookPages=400;
		*/
		
		// calling getBookData method  and passing argument
		b1.inputDetails("Harry Potter","Royston",20,5,400);
		
		// calling getBookData method
		b1.getBookData();
		
	}
}