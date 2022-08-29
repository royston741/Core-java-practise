/*
	Program: Creating a Laptop class  
	@author: Royston
	@Date  : 29 August 
*/
	
// importing all method from system class
import static java.lang.System.*;

//Creating a class named Laptop 
class Laptop
{
	// instance variables
	String LaptopBrand;
	int LaptopSrNo;
	int LaptopRam;
	String LaptopProcessor;
	int LaptopPrice;
	int LaptopRating;
	
	// creating getLaptopData method
	void getLaptopData(){
		// printing laptop data
		out.println("Laptop brand : " + LaptopBrand);
		out.println("Laptop serial no. : "+LaptopSrNo);		
		out.println("Laptop ram : "+ LaptopRam);
		out.println("Laptop processor : "+LaptopProcessor);
	  	out.println("Laptop prize : "+LaptopPrice+"$");
		out.println("Laptop rating : "+LaptopRating);
		
	}
	
	// Creating inputDetails method
	void inputDetails(String l_brand,int sr_no,int l_ram,String l_processor,int l_price,int l_rating){
		// initializing values
		LaptopBrand=l_brand;
		LaptopSrNo=sr_no;
		LaptopRam=l_ram;
		LaptopProcessor=l_processor;
		LaptopPrice=l_price;
		LaptopRating=l_rating;
	}
}

// creating a class named laptop details
class LaptopDetails
{	
	//calling main method
	public static void main(String...args){
		// creating new Laptop object
		Laptop l1=new Laptop();
		
		// calling getLaptopData method  and passing argument
		l1.inputDetails("Lenovo",1029901,4,"i3",400,3);
		
		// calling getLaptopData method
		l1.getLaptopData();
		
	}
}
