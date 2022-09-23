/*
	Program : charcter check
	@author : Royston
	@date : 12 September
*/

//import all methods from system class
import static java.lang.System.*;

// Creating a class named SwitchDemo
class CharacterOperatiions
{	
	// Creating printAsciValueOf method
	static void printAsciValueOf(String val){
		// Storing the input in a variable
		char value=val.charAt(0);
		// Storing the asci value of the input
		int asci=value;
		
		// printing the asci value of input
		out.print("The ASCI value of "+value+" is : "+asci);
	}	

	// Creating checkValue method
	static void checkValue(String str){
		// storing the value in a variable
		char value=str.charAt(0);
		
		// if value is uppercase
		if((value>=65)&&(value<=90)){
			out.print("It is a capital(uppercase) letter.");
			// if value is vowel
			if((value=='A')||(value=='E')||(value=='I')||(value=='O')||(value=='U')){
				out.println("It is a vowel.");
			}
			// if value is consonant
			else{
				out.println("It is a consonant.");
			}
		}
		// if value is lowercase 
		else if((value>=97)&&(value<=122)){
			out.print("It is a small(lowercase) letter.");
			// if value is vowel
			if((value=='a')||(value=='e')||(value=='i')||(value=='o')||(value=='u')){
				out.println("It is a vowel.");
			}
			// if value is consonant
			else{
				out.println("It is a consonant.");
			}

		}
		// if value is number
		else if((value>=48)&&(value<=57)){
			out.print("It is a number.");
		}
		// if value is special charcter
		else{
			out.print("It is a special charcter.");
		}
	}
	
		
	//Calling main method
	public static void main(String...args){
	
		// Calling checkValue method
		//checkValue(args[0]);
		
		printAsciValueOf(args[0]);
	}
}
