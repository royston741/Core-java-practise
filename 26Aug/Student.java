/*
	Program: Creating object using class 
	@author: Royston
	@Date  : 26 August 
*/

// import all System method from java 
import static java.lang.System.*;

// Create class student 
class Student{
	// attributes of a class
	String name;
	int age;
	int rollNo;
	char div;
	
	// creating a printStdInfo method
	void printStdInfo(){
		String course="Java";
		out.println("Student name is : "+name);
		out.println("Student age is : "+age);
		out.println("Student roll no is : "+rollNo);
		out.println("Student division is : "+div);
		out.println("Student course is : "+course);
	}
	
	//Calling main method
	public static void main(String...args){
		//Creating student object s1
		Student s1=new Student();
		//initializing values to s1
		s1.name="Ram";
		s1.age=12;
		s1.rollNo=40;
		s1.div='A';
		
		//initializing values to s2
		Student s2=new Student();
		s2.name="Sham";
		s2.age=15;
		s2.rollNo=50;
		s2.div='B';
		
		// Calling the printStdInfo method
		s1.printStdInfo();
		out.println();
		s2.printStdInfo();
		
	}
}