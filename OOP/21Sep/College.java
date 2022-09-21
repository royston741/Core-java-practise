/*
	Program : Creating ccollege class
	@author : Royston
	@date : 21 Sep
*/

// import all method from system cllass
import static java.lang.System.*;

// Creating a class named college
class College{
	// calling main method
	public static void main(String...args){
		// Constructor injection ------------> tight copuling
		out.println("---------------- TIGHT COUPLING ----------------");
		// Student 1
		Student s1= new Student("Roy",1,new String[]{"Geography","Science","Maths"});
		//printing student 1 details
		out.println("\n------------- STUDENT 1 ---------------");
		out.println("The student id is : "+s1.getStudentId());
		out.println("The student name is : "+s1.getStudentName());
		out.print("The subjects are : ");
		String sub1[]=s1.getSubjects();
		// running a for loop on sub1
		for(int i=0;i<sub1.length;i++){
			// printing the subjects 
			out.print(sub1[i]+"   ");
		}
		
		// Student 2
		Student s2= new Student("Harry",2,new String[]{"History","Physics","Computer"});
		//printing student 2 details
		out.println("\n------------- STUDENT 2 ---------------");
		out.println("The student id is : "+s2.getStudentId());
		out.println("The student name is : "+s2.getStudentName());
		out.print("The subjects are : ");
		String sub2[]=s2.getSubjects();
		// running a for loop on sub2
		for(int i=0;i<sub2.length;i++){
			// printing the subjects 
			out.print(sub2[i]+"   ");
		}
	
		// getter and setter -----------> loose copuling
		
		out.println("\n\n---------------- LOOSE COUPLING ----------------");
		//Student 3
		Student s3=new Student();
		s3.setStudentId(3);
		s3.setStudentName("Sham");
		s3.setSubjects(new String[]{"Java","SQL","C++"});
		//printing student 3 details
		out.println("\n------------- STUDENT 3 ---------------");
		out.println("The student id is : "+s3.getStudentId());
		out.println("The student name is : "+s3.getStudentName());
		out.print("The subjects are : ");
		String sub3[]=s3.getSubjects();
		// running a for loop on sub2
		for(int i=0;i<sub3.length;i++){
			// printing the subjects 
			out.print(sub3[i]+"   ");
		}
		
		//Student 4
		Student s4=new Student();
		s4.setStudentId(4);
		s4.setStudentName("Tom");
		s4.setSubjects(new String[]{"C","JS","React"});
		//printing student 4 details
		out.println("\n------------- STUDENT 4 ---------------");
		out.println("The student id is : "+s4.getStudentId());
		out.println("The student name is : "+s4.getStudentName());
		out.print("The subjects are : ");
		String sub4[]=s4.getSubjects();
		// running a for loop on sub2
		for(int i=0;i<sub4.length;i++){
			// printing the subjects 
			out.print(sub4[i]+"   ");
		}
	}
}