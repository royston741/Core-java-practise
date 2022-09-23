/*
	program : palindrome program 
	@author : Royston
	@date : 13 September	
*/

// import all methods from System class
import static java.lang.System.*;

// Creating a class named PalindromeDemo
class PalindromeDemo{
	
	// Creating a checkIfPalindrome method
	static void checkIfPalindrome(int number){
		
		// remainder variable
		int remainder=0;
		// reversed number variable
		int reversedNummber=0;
		// temprary number variable
		int temp=number;
		
		// while the temp is greater than 0
		while(temp>0){
			// remainder is equal to temp/10
			remainder=temp%10;
			// reversedNummber is equal to reversedNummber *10 +remainder((3*10)+4)
			reversedNummber=(reversedNummber*10)+remainder;
			// temp devide by 10
			temp/=10;
		}
		
		// number is equal to reversedNummber
		if(number==reversedNummber){
			// than palindrome
			out.println("The number is palindrome");
		}
		// number is not equal to reversedNummber
		else{
			// than not palindrome
			out.println("The number is not palindrome");
		}
	}
	
	// calling main method
	public static void main(String...args){
		// taking a input 
		int number =Integer.parseInt(args[0]);
		
		// calling checkIfPalindrome method and passing argument
		checkIfPalindrome(number);
	}

}