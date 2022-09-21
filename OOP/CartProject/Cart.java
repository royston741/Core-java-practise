/*
	Program : Creating Cart class
	@author : Royston
	@date : 21 Sep
*/

// creating a class named Cart 
class Cart{
	
	// properties of cart
	private Product [] cart;
	private int totalBill;
	private int storedProducts;

	// no argument constructor
	Cart(){
		// array of size 5
		cart=new Product[5];
	}	
	
	// parameterised constructor
	Cart(int size){
		// array size defined as per parmeter
		cart=new Product[size];
	}	
	
	// creating calcTotalBill method
	public int calcTotalBill(){
		// adding all the pproduct prices
		for(int i=0;i<cart.length;i++){
			totalBill+=cart[i].getProductPrice();
		}
		return totalBill;
	}
	
	// creating addTocart method
	public void addToCart(Product input)
	{	
		// if storedProducts is less than cart size (by default the storedProducts value is 0 as it is a instance variable)
		if(storedProducts<cart.length){	
			// product at position storedProducts
			cart[storedProducts]=input;
			// increment storedProducts
			storedProducts++;
			// print items added in my cart
			System.out.println(input.getProductName() + ": " + input.getProductPrice());
		}
		// if the cart is full 
		else{
			System.out.println("Shopping cart is full");
		}
	}
}