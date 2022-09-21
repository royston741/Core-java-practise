/*
	Program : Creating bank class
	@author : Royston
	@date : 21 Sep
*/

// import all method from system cllass
import static java.lang.System.*;

// Creating a class named Bank 
class Bank{
	// calling main method
	public static void main(String...args){
		
		// Tight couplig --------> constructor injection 
		Account a1=new Account(123,"Royston",12000);
		// printing account 1 details
		out.println("----------- Account 1 ------------");
		out.println("The Account Id is : "+a1.getAccId());
		out.println("The Account name is : "+a1.getAccHolderName());
		out.println("The Account balance is : "+a1.getAccBalance());
		
		// Loose coupling ---------> getter setter injection 
		Account a2=new Account();
		// setting the values of p2 
		a2.setAccHolderName("Harry");
		a2.setAccId(908);
		a2.setAccBalance(20000);		
		// printing account 2 details
		out.println("----------- Account 2 ------------");
		out.println("The Account Id is : "+a2.getAccId());
		out.println("The Account name is : "+a2.getAccHolderName());
		out.println("The Account balance is : "+a2.getAccBalance());

		
	}
}