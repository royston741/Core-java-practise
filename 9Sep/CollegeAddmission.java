/*
	Program : college eligibility program
	@author : Royston
	@date : 9 September
*/

//import all methods from system class
import static java.lang.System.*;

// Creating a class named CollegeAddmission
class CollegeAddmission
{	
	// method to check eligibility
	static void checkIfEligible(String...arr){
	
		// Storing the total marks and parsing it into int
		int totalMarks=Integer.parseInt(arr[0]);
		
		// Storing the pcm marks and parsing it into int
		int pcm=Integer.parseInt(arr[1]);
		
		// if total marks is less than 60
		if(totalMarks<60){
			// printing you are not eligible
			out.println("You are not eligible");
		}
		// if total marks is greater than 60
		else{
			// if total marks is greater than 80 and pcm marks is greater than 85
			if((totalMarks>80)||(pcm>85)){
				// printing you are eligible for B.Tech
				out.println("You are eligible for B.Tech");	
			}
			// if total marks is less than 80 or pcm marks is less than 85
			else{
				// printing you are eligible for other courses
				out.println("You are eligible for other courses");
			}
		}
	}
	
	//Calling main method
	public static void main(String...args){
	
		// Calling checkIfEligible method
		checkIfEligible(args);
	}
}
