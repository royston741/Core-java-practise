/*
	Program : Creating movie and theater object for implicit values
	@author : Royston
	@date : 20 Sep
*/

// import all methods from system class 
import static java.lang.System.*;

//Creating class named Theater
class Theater
{
	// Properties of theater 
	String movieName, movieTime;
	int movieTicketPrice,movieDuration;
	
	// Create insertMovies method
	void insertMovieDetail(String movieName,String movieTime,int movieTicketPrice,int movieDuration){
		// initialze variable  
		this.movieName=movieName;
		this.movieTime=movieTime;
		this.movieTicketPrice=movieTicketPrice;
		this.movieDuration=movieDuration;
	}
	
	// Create printMovieDetail method
	void printMovieDetail(){
		//printing movie Detail
		out.println("\n---------- MOVIE DETAIL -----------");
		out.println("The movie name is : "+movieName);
		out.println("The movie ticket price is : "+movieTicketPrice);
		out.println("The movie movie duration is : "+movieDuration+" hrs");
		out.println("The movie time is : "+movieTime);
	}
	
}// Movie class ends

//Creating class named Movie
class ImplicitMovie
{
	//Calling movie details
	public static void main(String...args){
		// Create new theater object
		Theater m1=new Theater();
		// calling insertMovieDetail method for m1 
		m1.insertMovieDetail("KGF","10AM",100,2);
		// calling printMovieDetail method for m1 
		m1.printMovieDetail();
	}
}