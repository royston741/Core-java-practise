/*
	Program : Calculate average of 3 ssubjects
	@author : Royston
	@date : 6 September	
*/

// Creating a class named Add
class Average
{	
	// Caliing main method
	public static void main(String args[]){
	
		// Taking the input from commandline
		int s1=Integer.parseInt(args[0]);
		int s2=Integer.parseInt(args[1]);
		int s3=Integer.parseInt(args[2]);
		
		// calculate the average
		int avg=(s1+s2+s3)/3;
		
		// print the average  
		System.out.println("The addition of two numbers is : "+avg);
		
	}// main method
	
	
}// class end
