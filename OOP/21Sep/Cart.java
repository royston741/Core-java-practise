/*
	Program : Creating cart class
	@author : Royston
	@date : 21 Sep
*/

// import all method from system cllass
import static java.lang.System.*;

// Creating a class named cart
class Cart{
	// calling main method
	public static void main(String...args){
		
		// Tight couplig --------> constructor injection 
		Product p1=new Product("Book",100,2);
		// printing product 1 details
		out.println("----------- PRODUCT 1 ------------");
		out.println("The item name is : "+p1.getProductName());
		out.println("The item price is : "+p1.getProductPrice());
		out.println("The item quantity is : "+p1.getProductQuantity());
		
		// Loose coupling ---------> getter setter injection 
		Product p2=new Product();
		// setting the values of p2 
		p2.setProductName("Pen");
		p2.setProductPrice(50);
		p2.setProductQuantity(2);
		// printing product 2 details
		out.println("\n----------- PRODUCT 2 ------------");
		out.println("The item name is : "+p2.getProductName());
		out.println("The item price is : "+p2.getProductPrice());
		out.println("The item quantity is : "+p2.getProductQuantity());
		
	}
}