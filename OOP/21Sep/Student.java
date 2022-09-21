/*
	Program : Creating student class
	@author : Royston
	@date : 21 Sep
*/

// creating a class named Student 
class Student{
	// porperties of a student
	private String studentName;
	private int studentId;
	private String[] subjects;
	
	// no arguments constructor
	Student(){}
	
	// parameterised constructor	
	Student(String studentName,int studentId,String[] subjects){
		// initializing the variables
		this.studentName=studentName;
		this.studentId=studentId;
		this.subjects=subjects;
	}
	
	// --------------- getter and setter for student name --------------
	// getter for studentName
	public String getStudentName(){
		return this.studentName;
	}
	
	// setter for studentName
	public void setStudentName(String studentName){
		this.studentName=studentName;
	}
	// --------------- getter and setter for student id --------------
	
	// getter for studentId 
	public int getStudentId(){
		return this.studentId;
	}
	
	// setter for studentId
	public void setStudentId(int studentId){
		this.studentId=studentId;
	}
	
	// --------------- getter and setter for subjects --------------
	
	// getter for subjects
	public String[] getSubjects(){
		return this.subjects;
	}
	
	// setter for subjects
	public void setSubjects(String [] subjects){
		this.subjects=subjects;
	}
}