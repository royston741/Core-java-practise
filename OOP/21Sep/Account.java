/*
	Program : Creating Account class
	@author : Royston
	@date : 21 Sep
*/

// import all methods from System class
import static java.lang.System.*;

// Creating a class named Account 
class Account
{	
	// properties of account
	private int accId;
	private String accHolderName;
	private double accBalance;
	
	// no arguments constructor
	Account(){}
	
	// parameterised constructor
	Account( int accId,String accHolderName, double accBalance){
		// initializing variables
		this.accId=accId;
		this.accHolderName=accHolderName;
		this.accBalance=accBalance;
	}
	
	// --------------- getter and setter for account Id --------------
	
	// getter for accId
	public int getAccId(){
		// return accId
		return this.accId;
	}	
	
	// setter for accId
	public void setAccId(int accId){
		// set accId
		this.accId=accId;
	}	
	
	// --------------- getter and setter for account holder name --------------
	
	// getter for accHolderName
	public String getAccHolderName(){
		// return accHolderName
		return this.accHolderName;
	}
	
	// setter for accHolderName
	public void setAccHolderName(String accHolderName){
		// set accHolderName
		this.accHolderName=accHolderName;
	}
	
	// --------------- getter and setter for account balance --------------
	
	// getter for accBalance
	public double getAccBalance(){
		// return accBalance
		return this.accBalance;
	}
	
	// setter for accBalance
	public void setAccBalance(double accBalance){
		// set accBalance
		this.accBalance=accBalance;
	}

	
}