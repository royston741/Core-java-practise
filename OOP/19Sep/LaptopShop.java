/*
	Prgram : Creating a laptop class
	@author : Royston
	@date : 19 Sep
*/

// import all methods from system class 
import static java.lang.System.*;

// import scanner class 
import java.util.Scanner;

// Creating a class named laptop 
class Laptop
{
	// Properties of laptop class 
	private String brandName,processor;
	private int model,storage,price;
	
	// Creating inputDetails method
	void inputDetails(){
		// Creating a new scanner object
		Scanner sc=new Scanner(System.in);
		
		// Taking brand name input
		out.print("Enter the brand name : ");
		brandName=sc.next();

		// Taking input for processor	
		out.print("Enter the processor : ");
		processor=sc.next();
		
		// Taking model input
		out.print("Enter the model : ");
		model=sc.nextInt();
		
		// Taking storage input
		out.print("Enter the storage : ");
		storage=sc.nextInt();

		// Taking pr input	
		out.print("Enter the price : ");
		price=sc.nextInt();
		
		// Calling addDetails method
		addDetails(brandName,model,processor,storage,price);
		
	}
	
	// Creating addDetails method 
	void addDetails(String brandName,int model,String processor,int storage,int price){
		// initializing the variables
		this.brandName=brandName;
		this.model=model;
		this.processor=processor;
		this.storage=storage;
		this.price=price;
	}
	
	// Creating printDetails method
	void printDetails(){
		// printing the laptop details
		out.println("The brand name is : "+brandName);
		out.println("The model is : "+model);
		out.println("The processor is : "+processor);
		out.println("The storage is : "+ storage +"GB");
		out.println("The price is : "+price);
	}
	
}// Laptop class ends

// Creating a class named LaptopShop
class LaptopShop
{
	// Calling main method
	public static void main(String args[]){
		// Creating a new object l1 
		Laptop l1=new Laptop();
		
		// calling inputDetails method for l1 
		l1.inputDetails();	
		
		out.println("\n---------------- LAPTOP DETAILS --------------\n");
		// calling printDetails method for l1 
		l1.printDetails();	
	}
		
}