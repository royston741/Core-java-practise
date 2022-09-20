/*
	Program : Creating movie and theater object for explicit values
	@author : Royston
	@date : 20 Sep
*/

//import scanner class
import java.util.Scanner;

// import all methods from system class 
import static java.lang.System.*;

//Creating class named Theater
class Theater
{
	// Properties of theater 
	String movieName, movieTime;
	int movieTicketPrice,movieDuration;
	
	// Create insertMovies method
	void insertMovieDetail(){
		// create new scanner object 
		Scanner sc =new Scanner(System.in);
		
		// Input movie name 
		out.print("Enter movie name : ");
		this.movieName=sc.next();
		
		// Input movie time
		out.print("Enter movie time : ");
		this.movieTime=sc.next();
		
		// Input movie ticket price 	
		out.print("Enter movie ticket price : ");
		this.movieTicketPrice=sc.nextInt();
		
		// Input movie duration
		out.print("Enter movie duration : ");
		this.movieDuration=sc.nextInt();
	}
	
	// Create printMovieDetail method
	void printMovieDetail(){
		//printing movie Detail
		out.println("\n---------- MOVIE DETAIL -----------");
		out.println("The movie name is : "+movieName);
		out.println("The movie ticket price is : "+movieTicketPrice);
		out.println("The movie time is : "+movieTime);
		out.println("The movie movie duration is : "+movieDuration+" hrs");
	}
	
}// Movie class ends

//Creating class named Movie
class ExplicitMovie
{
	//Calling movie details
	public static void main(String...args){
		// Create new theater object
		Theater m1=new Theater();
		// calling insertMovieDetail method for m1 
		m1.insertMovieDetail();
		// calling printMovieDetail method for m1 
		m1.printMovieDetail();
	}
}