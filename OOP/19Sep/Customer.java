/*
	Prgram : Creating bank account object 
	@author : Royston
	@date : 19 Sep
*/

// import all methods from system class 
import static java.lang.System.*;

// import scanner class 
import java.util.Scanner;

// Creating a class named Account
class Account
{	
	// Properties of bank account 
	private long accountAmount; 
	private String accountNum,ifscCode,mobileNum,accountHolderName;
		
	// encode the account nuber method
	private String encodeAccountNum(){
		return "*******"+accountNum.charAt(7)+accountNum.charAt(8)+accountNum.charAt(9);
	}
	
	// encode the mobile nuber method
	private String encodeMobileNum(){
		return "*******"+mobileNum.charAt(7)+mobileNum.charAt(8)+mobileNum.charAt(9);
	}
	
	// Creating inputDetails method
	void inputDetails(){
		// Creating a new scanner object
		Scanner sc =new Scanner(System.in);
		
		// taking account holder name input
		out.print("Enter account holder name : ");
		accountHolderName=sc.nextLine();
		
		// taking account number input
		out.print("Enter account number : ");
		accountNum=sc.next();
		
		// Taking mobile number input	
		out.print("Enter mobile number : ");
		mobileNum=sc.next();
		
		// Taking account amount input
		out.print("Enter the amount in the account : ");
		accountAmount=sc.nextInt();
		
		// Taking ifsc input
		out.print("Enter the IFSC code : ");
		ifscCode=sc.next();
		
		// calling add details method
		addDetails(accountHolderName,accountNum,mobileNum,accountAmount,ifscCode);
	}
	
	// Creating addDetails method
	void addDetails(String accountHolderName,String accountNum,String mobileNum,long accountAmount, String ifscCode){
		// initializing the variables
		this.accountHolderName=accountHolderName;
		this.accountNum=accountNum;
		this.mobileNum=mobileNum;
		this.accountAmount=accountAmount; 
		this.ifscCode=ifscCode;
	}

	// Creating printDetails method
	void printDetails(){	
		// print account details
		out.println("\n ---------- ACCOUNT DETAILS --------- \n");
		out.println("The account holder name is : " +accountHolderName);
		out.println("The account number is : " +encodeAccountNum());
		out.println("The mobile number is : " + encodeMobileNum());
		out.println("The account amount is : " + accountAmount);
		out.println("The IFSC code is : " + ifscCode);
	}
	
}// Account class ends 

// Creating a class named Customer
class Customer
{
	// Calling main method
	public static void main(String...args){
		// Creating a new account object
		Account a1=new Account();
		// calling inputDetails method
		a1.inputDetails();
		// calling printDetails method
		a1.printDetails();
	}
		
}