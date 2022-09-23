/*
	Program : Print number of days accrding to the month
	@author : Royston
	@date : 12 September
*/

//import all methods from system class
import static java.lang.System.*;

// Creating a class named MonthPrinter
class DaysPrinter
{	
	// crating getMonth method
	static void getMonth(int month){
		// compating cmonth with cases
		switch(month){
			// if 31 days 
			case 1: 
			case 3:	
			case 5:
			case 7: 
			case 8: 
			case 10:		
			case 12: out.println("Number of days are: 31");
					 break;
			// if 28 days	
			case 2: out.println("Number of days are: 28");
		            break;	
			case 4: 
			case 6:	
			case 9:
			// if 30 days 
			case 11: out.println("Number of days are: 30");
					 break;				
			// if wrong input 	
			default:System.out.println("Wrong input ");
		}// swithch ends
	} 
	// calling main method
	public static void main(String...args){
		// calling getMonth method
		getMonth(Integer.parseInt(args[0]));
	}
}