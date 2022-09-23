/*
	program : Phone charging
	@author : Royston
	@date : 13 September	
*/

// import all methods from System class
import static java.lang.System.*;

// Creating a class named PalindromeDemo
class PhoneCharging{
	
	// Creating a startCharging method
	static void startCharging(int batteryLife){
		
		// while the phone is not fully charged 
		while(batteryLife<100){
			// print charging
			out.println("--------Charging--------"+batteryLife);
			batteryLife+=10;
		}
		
		// if batteryLife is greater or equal to 100
		if(batteryLife>=100){
			// print 1000% charged
			out.println("Your phone is 100% charged");
		}

	}
	
	// calling main method
	public static void main(String...args){
		// taking a input 
		int battery =Integer.parseInt(args[0]);
		
		// calling checkIfPalindrome method and passing argument
		startCharging(battery);
	}

}