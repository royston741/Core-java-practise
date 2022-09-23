/*
	Program : A school has following rules for grading system:
			  a. Below 25 - F
			  b. 25 to 45 - E
			  c. 45 to 50 - D
			  d. 50 to 60 - C
			  e. 60 to 80 - B
			  f. Above 80 - A
			  Ask user to enter marks and print the corresponding grade.
	@author : Royston
	@date : 12 September
*/

//import all methods from system class
import static java.lang.System.*;

// Creating a class named GradeCalculation
class GradeCalculation
{	
	// Creating method to print the grade
	static void calculateGrade(String strMarks){
		
		// parsing the strMarks into integer and storing it into variable
		int marks =Integer.parseInt(strMarks);
		
		// if less than 25
		if(marks<25){
			out.println("The grade is F.");
		}
		// if less than 45
		else if(marks<45){
			out.println("The grade is E.");
		}
		// if less than 50
		else if(marks<50){
			out.println("The grade is D.");
		}
		// if less than 60
		else if(marks<60){
			out.println("The grade is C.");
		}
		// if less than 80
		else if(marks<80){
			out.println("The grade is B.");
		}
		// if greater than 80
		else{
			out.println("The grade is A.");
		}
		
	}
	
		
	//Calling main method
	public static void main(String...args){
	
		// Calling calculateGrade method and passing a argument
		calculateGrade(args[0]);
	}
}
