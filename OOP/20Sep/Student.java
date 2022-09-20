/*
	Program : program on constructors
	@author : Royston
	@date : 20 Sep
*/

//import every method from System class 
import static java.lang.System.*;

// Creating student class 
class Student{
	// properties of a student
	private int id;
	private String name;
	private String course;
	private float marks;
	
	/* 
		we can have many constructor in our class and the constructor would be 
		selected on the basis of parameter i.e method overloading
		polymorphisum :- one name may forms
	
		when we create parameterised constructor there is also a need of creating 
		no argument constructor
	*/ 
	
	// no argument constructor
	Student(){
		out.println("\n--------------- No argument cunstructor ---------------");
		//initializing the variables
		this.id=00;
		this.name="No name";
		this.marks=33;
		this.course="null";
	}
	
	// parameterised constructor
	Student(int id, String name, float marks, String course){
		out.println("\n--------------- Parameterised constructor ---------------");
		//initializing the variables
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.course=course;
	}
	
	// parameterise constructor for cloning
	Student(Student s){
		out.println("\n--------------- cloned constructor ---------------");
		//initializing the variables		
		this.id=s.id;
		this.name=s.name;
		this.marks=s.marks;
		this.course=s.course;
	}
	
	//Creating displayDetails method
	void displayDetails(){
		// printing detail
		out.println("The student id is : "+id);
		out.println("The student name is : "+name);
		out.println("The student marks is : "+marks);
		out.println("The student course is : "+course);
	}
	
	// creating changeCourse method 
	void changeCourse(String course){
		//changing the course value
		this.course=course;
	}
	
	// Calling main method
	public static void main(String...args){
		// Creating a new student object and passing no arguments so as to call the no arguments constructor
		//Student s1=new Student();
		//out.println("The details of student 1");
		//s1.displayDetails();
		
		// Creating a new student object and passing arguments so as to call the no parameterised constructor
		Student s2=new Student(12,"Royston",70,"Java");
		out.println("The details of student 2");
		s2.displayDetails();
		
		/*
		//Copying : when we copy an object and change value for one the value for other is also changed
		
		// Crating a new object s3
		Student s3=new Student();
		// copy object s2 to s3 
		s3=s2;
		// display details of s3
		out.println("The details of student 3");
		s3.displayDetails();
		
		// changing the course for student 2
		s2.changeCourse("Python");
		
		// Again printing deatils of student 2 and 3
		out.println("\n------------ AFTER CHANGING VALUES-----------");
		out.println("\nThe details of student 2");
		s2.displayDetails();
		
		out.println("\nThe details of student 3");
		s3.displayDetails();
		*/
		
		// Clone : when we clone an object and change value for one the value for other is not changed
		
		// Crating a new object s3
		Student s3=new Student(s2);
		
		// display details of s3
		out.println("The details of student 3");
		s3.displayDetails();
		
		// changing the course for student 2
		s2.changeCourse("Python");
		
		// Again printing deatils of student 2 and 3
		out.println("\n------------ AFTER CHANGING VALUES-----------");
		out.println("\nThe details of student 2");
		s2.displayDetails();
		out.println("\nThe details of student 3");
		s3.displayDetails();
	}
}

