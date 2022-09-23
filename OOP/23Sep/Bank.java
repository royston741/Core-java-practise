/*
	Program : Display account with less than 1000	
	@Author : Royston
	@date : 23 September			  
*/

// import all the methods from System
import static java.lang.System.*;

// import scanner class
import java.util.Scanner;

// Creating a class named Account
class Account{
	// properties of Account 
	private int accountNum;
	private String accountHolderName;
	private int accountBalance;
	
	// no argument constructor
	Account(){}
	
	// parameterised constructor
	Account(int accountNum, String accountHolderName,int accountBalance){
		// intitializing variables
		this.accountNum=accountNum;
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
	}
	
	// getter for accountNum
	public int getAccountNum(){
		// return accountNum
		return this.accountNum;
	}
	
	// setter for setAccountNum
	public void setAccountNum(int accountNum){
		// setting accountNum
		this.accountNum=accountNum;
	}

	// getter for accountHolderName
	public String getAccountHolderName(){
		// return accountHolderName
		return this.accountHolderName;
	}
	
	// setter  for accountHolderName
	public void setAccountHolderName(String accountHolderName){
		// setting accountHolderName
		this.accountHolderName=accountHolderName;
	}
	
	// getter for accountBalance
	public int getAccountBalance(){
		// return accountBalance
		return this.accountBalance;
	}	
	
	// setter accountBalance
	public void setAccountBalance(int accountBalance){
		// setting accountBalance	
		this.accountBalance=accountBalance;
	}
	
}// Account class end


// Creating Bank class
class Bank{
	// calling main method
	public static void main(String...args){
		/*
		// Creating an array of accounts
		Account b1[]=new Account[5];
		
		// Constructor injection
		b1[0]=new Account(1,"Pushpa",100);
		b1[1]=new Account(2,"Rocky",40000);
		b1[2]=new Account(3,"Gin",10000);
		b1[3]=new Account(4,"Tam",30000);
		b1[4]=new Account(5,"Ram",800);
		*/
		
		// create a scanner object
		Scanner sc=new Scanner(System.in);
		
		// input array size
		out.println("Enter the size of the array : ");
		int size =sc.nextInt();
		// create a array
		Account b1[]=new Account[size];
		
		// Inputs		
		for(int i=0;i<b1.length;i++){
			// Creating a object
			b1[i]=new Account();
			// accountNum input
			out.println("Enter the account number : ");
			b1[i].setAccountNum(sc.nextInt());
			// accountHolderName input
			out.println("Enter the account holder name : ");
			b1[i].setAccountHolderName(sc.next());
			// accountBalance input
			out.println("Enter the account balance : ");
			b1[i].setAccountBalance(sc.nextInt());
		}
		
		// running the loop on b1 array
		for(int i=0;i<b1.length;i++){
			// storing the amount in a variable
			int amount=b1[i].getAccountBalance();
			// if amount is less than 1000
			if(amount<1000){
				// print account details
				out.println("\n------- Account "+i+" Detsils -------");
				out.println("The account id is : "+b1[i].getAccountNum());
				out.println("The account holder name is : "+b1[i].getAccountHolderName());
				out.println("The account balance is : "+b1[i].getAccountBalance());
			} // if ends 
			
		} // for loop ends
		
	} //main method ends 
	
}// Bank class ends  