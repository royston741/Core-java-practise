/*
	Program : Creating calculator class
	@author : Royston
	@date : 22 Sep
*/

// importing scanner class
import java.util.Scanner;

.// importing all methods from system
import static java.lang.System.*;

// Creating calculator class
class Calculator{
	// result variable
	static double result;
	
	// Creating add method
	double add(double num1,double num2){
		return num1+num2;
	}
	
	// Creating substract method
	double substract(double num1,double num2){
		return num1-num2;
	}
	
	// Creating multiply method
	double multiply(double num1,double num2){
		return num1*num2;
	}
	
	// Creating divide method
	double divide(double num1,double num2){
		return num1/num2;
	}
	
	// Calling main method
	public static void main(String...args){
		out.println("---------- Calculator ----------");
		// Creating scanner object
		Scanner sc=new Scanner(System.in);
		// Input  number 1
		out.println("Enter number 1 :");
		double n1=sc.nextInt();
		// Input number 2
		out.println("Enter number 2 :");
		double n2=sc.nextInt();
		
		//Creating c1 object
		Calculator c1=new Calculator();
		
		// while we want to calculate	
		while(true){
			//Input operator
			out.println("Enter operator : ");
			char operator=sc.next().toLowerCase().charAt(0);
			//comparing operator with cases
			switch(operator){
				// if +
				case '+'->result=c1.add(n1,n2);
				// if -
				case '-'->result=c1.substract(n1,n2);
				// if *
				case '*'->result=c1.multiply(n1,n2);
				//if /
				case '/'->result=c1.divide(n1,n2);
				// if wrong input
				default->out.println("Wrong input");
			}// switch ends
			// print results
			out.println(n1+" "+operator+" "+n2 +" = " +result);
			// Take choice input
			out.println("Do you want to perform more operation (y/n)");
			char choice=sc.next().toLowerCase().charAt(0);
			// if yes
			if(choice=='y'){
				// n1 is result
				n1=result;
				//Input n2
				out.println("Enter number :");
				n2=sc.nextInt();
			}
			// if no
			else{
				// come out of the loop
				break;
			}// if else ends
			
		} // while loop ends
		
	}// main method ends

} //Calculator class ends