/*
	Program : Print the day
	@author : Royston
	@date : 9 September
*/

//import all methods from system class
import static java.lang.System.*;

// Creating a class named SwitchDemo
class SwitchDemo
{	
	// Creating method to print the day
	static void printDay(String strDay){
		
		// parsing the strDay into int and storing it into day variable
		int day=Integer.parseInt(strDay);
		
		// comparing the day with the cases
		switch(day){
			// if the day is 1
			case 1: out.print("Sunday");
					break;
			// if the day is 2
			case 2: out.print("Monday");
					break;
			// if the day is 3
			case 3: out.print("Tuesday");
					break;
			// if the day is 4
			case 4: out.print("Wednesday");
					break;
			// if the day is 5
			case 5: out.print("Thursday");
					break;
			// if the day is 6
			case 6: out.print("Friday");
					break;		
			// if the day is 7
			case 7: out.print("Saturday");
					break;		
			// if the input is wrong 
			default:out.print("Wrong input");		
		} // switch ends

	}
	
		
	//Calling main method
	public static void main(String...args){
	
		// Calling printDay method
		printDay(args[0]);
	}
}
