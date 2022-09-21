/*
	Program : Constructor chaining
	@author : Royston
	@date : 21 Sep
*/

// Creating a class nameed Pen
class Pen
{
	// properties of pen	
	private String brand;
	private String color;
	private double price;
  
	// no argument constructor
	Pen()
	{
		System.out.println("-------constructor 1------");
	}
	
	// parameterised constructor
	Pen(String brand)
	{   
		// calling constructor 1
		this();
		System.out.println("-------constructor 2------");
		//initialising values
		this.brand=brand;
	}
	
	// parameterised constructor
	Pen(String brand,String color, double price)
	{	// calling constructor 2
		this(brand);
		System.out.println("-------constructor 3------");
		//initialising values
		this.price= price;
		this.color=color;
	}
	
	// creating display method
	void display()
	{	// printing details
		System.out.println("Pen Brand:"+brand);
		System.out.println("Pen Colour:"+color);
		System.out.println("Pen Price:"+price);
	}
	
	// calling main method 
	public static void main(String ... args)
	{	/*
		// Case 1 -> constructor 1 invoking
		Pen p1 =new Pen();
		// calling display method for p1 
		p1.display();
		*/ 
		
		// Case 2 -> constructor 1 & 2 invoking
		Pen p2= new Pen("Reynolds");
	    // calling display method for p2
	    p2.display();
		 
		 
		/*
	    // Case 3 -> constructor 1,2 & 3 invoking
		Pen p3= new Pen("Reynolds","Black",10);
		// calling display method for p2
		p3.display();
		*/
	  
  }

}