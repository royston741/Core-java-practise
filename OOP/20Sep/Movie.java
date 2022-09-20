/*
	Program : Creating a object of constructor
	@author : Royston
	@date : 20 Sep
*/

// import all the methods from system class
import static java.lang.System.*;

// Creating class named Theater
class Theater 
{	
	// properties of theater
	private String movieName;
	private String movieTime;
	private double movieTicketPrice;
	
	// default constructor (We need to declare default constructor if we use parameterised constructor)
	Theater(){} 
	
	//parameterised constructor
	Theater(String movieName,String movieTime,double movieTicketPrice){
		// initializing variables
		this.movieName=movieName;
		this.movieTime=movieTime;
		this.movieTicketPrice=movieTicketPrice;
	}

	// Creating displayMovie method
	void displayMovie(){
		// printing movie details
		out.println("The movie name is : "+movieName);
		out.println("The movie time is : "+movieTime);
		out.println("The movie ticket price is : "+movieTicketPrice+" Rs");
	}	
	
} // Theater class ends 

// Creating class named Movie
class Movie
{
	// Calling main method
	public static void main(String...args){
		// Creating a array of movie objects
		Theater movie[]=new Theater[5];
		
		// Creating objects 
		movie[0]=new Theater("KGF","3pm to 6pm",200);
		movie[1]=new Theater("Pushpa","4pm to 7pm",300);
		movie[2]=new Theater("Don","5pm to 8pm",400);
		movie[3]=new Theater("Avatar","6pm to 9pm",500);
		movie[4]=new Theater("Hulk","7pm to 10pm",600);
		
		//Displaying all the movies
		out.println("-------- The Movie List --------");
		for(int i=0;i<movie.length;i++){
			out.println("\n ----- MOVIE "+i+" -----");
			// calling displayMovie method 
			movie[i].displayMovie();
		}
	}
}