/*
	Program: Creating a constructor 
	@author: Royston
	@Date  : 29 August 
*/

// import all the methods from System class
import static java.lang.System.*;

// Creating a class named Project
class Project{
	
	// instance varibles
	int projectId;
	String projectName;
	String projectSub;
	boolean projectStatus;

	// Default project constructor	
	Project(){
		out.println("-------------- This is a default constructor ---------------");
		out.println("Project id "+ projectId);
		out.println("Project name : "+projectName);
		out.println("Project Language  : "+projectSub);
		out.println("Project status : "+projectStatus);
	}
	
	// parameterized constructor
	Project(int pr_id,String pr_name,String pr_sub,boolean pr_status){
		out.println("\n-------------- This is a parameterized constructor ---------------");
		projectId=pr_id;
		projectName=pr_name;
		projectSub=pr_sub;
		projectStatus=pr_status;
	}
	
	// Creating projectDetails method
	void printProjectDetails(){
	
		// if projectStatus is true it will print all the details
		if(projectStatus){
			out.println("Project id : "+projectId);
			out.println("Project name : "+projectName);
			out.println("Project Language : "+projectSub);
		}else{
			out.println("The project is not authorized for id "+projectId);
		}
	}
}

// Creating a class named ProjectCheck
class ProjectCheck{
	// calling main class 
	public static void main(String...args){
		// student 1
		Project s1=new Project();
		s1.printProjectDetails();
		
		// student 2
		Project s2=new Project(1,"Library system","JAVA",true);		
		s2.printProjectDetails();
		
		// student 3
		Project s3=new Project(2,"Employee system","C",true);		
		s3.printProjectDetails();
		
		// student 4
		Project s4=new Project(3,"Student system","PYTHON",true);		
		s4.printProjectDetails();
		
		// student 5
		Project s5=new Project(3,"Airline system","RUBY",false);		
		s5.printProjectDetails();
	}
}