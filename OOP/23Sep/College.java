/*
	Program : Print students with 90 and above		
	@Author : Royston
	@date : 23 September			  
*/

// import Scanner class
import java.util.Scanner;

// import all the methods from System
import static java.lang.System.*;

// Creating a class named Student
class Student{
	// properties of a student 
	private int stdId;
	private String stdName;
	private float stdPercentage;
	
	// no argument constructor
	Student(){}
	
	// parameteried constructor
	Student(int stdId,String stdName,float stdPercentage){
		// initializing the values
		this.stdId=stdId;
		this.stdName=stdName;
		this.stdPercentage=stdPercentage;
	}
	
	// getter for stdId
	public int getStdId(){
		// return stdId
		return this.stdId;
	}
	
	// setter for stdId
	public void setStdId(int stdId){
		// initialize stdId
		this.stdId=stdId;
	}
	
	// getter for stdName
	public String getStdName(){
		// return stdName
		return this.stdName;
	}
	
	// setter for stdName
	public void setStdName(String setStdName){
		// initialize stdName
		this.stdName=setStdName;
	}
	
	// getter for stdPercentage
	public float getStdPercentage(){
		// initialize stdPercentage	
		return this.stdPercentage;
	}	
	
	// setter for stdPercentage
	public void setStdPercentage(float stdPercentage){
		// initialize stdPercentage
		this.stdPercentage=stdPercentage;
	}
}// Student class ends

//Creating College class
class College{
	// calling main method
	public static void main(String...args){
		// create a scanner object
		Scanner sc=new Scanner(System.in);
		
		// input array size
		out.println("Enter the size of the array : ");
		int size =sc.nextInt();
		// create a array
		Student std[]=new Student[size];
		
		// Inputs		
		for(int i=0;i<std.length;i++){
			// Creating a object
			std[i]=new Student();
			// accountNum input
			out.println("Enter the student id : ");
			std[i].setStdId(sc.nextInt());
			// accountHolderName input
			out.println("Enter the student name : ");
			std[i].setStdName(sc.next());
			// accountBalance input
			out.println("Enter the student percentage : ");
			std[i].setStdPercentage(sc.nextInt());
		}
		
		// looping in std array 
		for(int i=0;i<std.length;i++){
			// storing the percentage
			float per=std[i].getStdPercentage();
			// percentage greater than 90
			if(per>=90){		
				// print student details
				out.println("\n------------ STUDENT "+i+" DETAILS -----------");
				out.println("The student id is : "+std[i].getStdId());
				out.println("The student name is : "+std[i].getStdName());
				out.println("The student percentage is : "+std[i].getStdPercentage());
			}// if ends
			
		}// for ends
		
	}// main method ends
	
}// College class ends