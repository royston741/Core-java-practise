/*
	Prgram : Creating Student object 
	@author : Royston
	@date : 19 Sep
*/

// import all methods from system class 
import static java.lang.System.*;

// import scanner class 
import java.util.Scanner;

// Creating a class named Student
class Student
{
	// properties of student
	private String name;
	private int id;
	
	// Creating password method
	private String passwordMethod(){
		return name+123;
	}
	
	// creating inputDetails method
	void inputDetails(){
		// Creating a new scanner object
		Scanner sc=new Scanner(System.in);
		
		// Taking name input
		out.print("The student name is : ");
		this.name=sc.next();
		
		//Taking id input 
		out.print("The student id is : ");
		this.id=sc.nextInt();
	}
	
	// creating printDetails method
	void printDetails(){
		// printing the details
		out.println("\nThe student name is : "+name);
		out.println("The student id is : "+id);
		out.println("The student password is : "+passwordMethod());
	}
}// Student class ends

// Creating ImsCreation class
class ImsCreation{
	// calling main method
	public static void main(String...args){
		// Creating a array of objects 
		Student studArray[]=new Student[5];
		
		// running a loop to enter the elements in an array 
		for(int i=0;i<studArray.length;i++){
			// Creating a new student object 
			studArray[i]=new Student();
			// inputing the elements
			studArray[i].inputDetails();
		}
				
		out.println("\n--------- STUDENT DETAILS ---------");
		// running a loop for printing the student details 
		for(int i=0;i<studArray.length;i++){
			// print elements of array 
			studArray[i].printDetails();
		}
		
		
	
	}
}