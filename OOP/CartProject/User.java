/*
	Program : Creating User class
	@author : Royston
	@date : 21 Sep
*/

// creating a class named User 
class User{
	// calling main method
	public static void main(String...args){
	
		// constructor injection 
		Product pen = new Product("Ball Pen",3,15);
		Product mobile= new Product("Apple",1, 75000);
		Product chocolate = new Product("Dairy Milk", 20,20);
		Product book = new Product("Computer",3,450);
		Product chips= new Product("Nachos",2,90);
		
		//Creating a cart
		Cart c1=new Cart();
		c1.addToCart(pen);
		c1.addToCart(mobile);
		c1.addToCart(chocolate);
		c1.addToCart(book);
		c1.addToCart(chips);
		
		// print total bill
		System.out.println("-------------------");
		System.out.println("Bill Amount :"+c1.calcTotalBill());
		System.out.println("-------------------");
	}
}