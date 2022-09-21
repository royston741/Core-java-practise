/*
	Program : Creating product class
	@author : Royston
	@date : 21 Sep
*/

// creating a class named Product 
class Product{
	// porperties of a cart
	private String productName;
	private int productPrice;
	private int productQuantity;
	
	// no arguments constructor
	Product(){}
	
	// parameterised constructor	
	Product(String productName,int productPrice,int productQuantity){
		// initializing the variables
		this.productName=productName;
		this.productPrice=productQuantity*productPrice;
		this.productQuantity =productQuantity;
	}
	
	// --------------- getter and setter for product name --------------
	// getter for productName 
	String getProductName(){
		return this.productName;
	}
	
	// setter for productName
	void setProductName(String productName){
		this.productName=productName;
	}
	// --------------- getter and setter for product price --------------
	
	// getter for productPrice
	int getProductPrice(){
		return this.productPrice;
	}
	
	// setter for productPrice
	void setProductPrice(int productPrice){
		this.productPrice=productPrice;
	}
	
	// --------------- getter and setter for product quantity --------------
	
	// getter for productQuantity
	int getProductQuantity(){
		return this.productQuantity;
	}
	
	// setter for productQuantity
	void setProductQuantity(int productQuantity){
		this.productQuantity=productQuantity;
	}
}