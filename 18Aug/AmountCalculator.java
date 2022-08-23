/*
	Program: Program for calculating the notes for a given amount 
	@author: Royston
	@Date  : 18 August 
*/


// Creating a class named AmountCalculator
class AmountCalculator
{	
	// Creating calculateNotesForAmount method
	static void calculateNotesForAmount(int amount){
		
		// Storing the number of notes 
		int note1=0,note2=0,note5=0,note10=0,note20=0,note50=0,note100=0;
		
		// While the amount is not equal to 0 continue
		while(amount!=0){
			
			// if the amount is greater than or equal to 100Rs
			if(amount>=100){
				// Add one to note100
				note100++;
				// Substract 100 Rs from amount
				amount-=100;
			}
			// if the amount is less than 100 Rs and greater than equal to 50Rs
			else if(amount>=50){
				// Add one to note50
				note50++;
				// Substract 50 Rs from amount
				amount-=50;
			}
			// if the amount is less than 50 Rs and greater than equal to 20Rs 
			else if(amount>=20){
				// Add one to note20
				note20++;
				// Substract 20 Rs from amount
				amount-=20;
			}
			// if the amount is less than 20 Rs and greater than equal to 10Rs
			else if(amount>=10){
				// Add one to note10
				note10++;
				// Substract 10 Rs from amount
				amount-=10;
			}
			// if the amount is less than 10 Rs and greater than equal to 5Rs
			else if(amount>=5){
				// Add one to note5
				note5++;
				// Substract 5 Rs from amount
				amount-=5;
			}
			// if the amount is less than 5 Rs and greater than equal to 2 Rs
			else if(amount>=2){
				// Add one to note2
				note2++;
				// Substract 2 Rs from amount
				amount-=2;
			}
			// if the amount is less than 2 Rs and greater than equal to 1Rs
			else if(amount>=1){
				// Add one to note1
				note1++;
				// Substract 1 Rs from amount
				amount-=1;
			}
			// if wrong input
			else{
				// print wrong input statement and exit from the loop
				System.out.println("The amount "+amount+" is not recognized by the system. ");
				break;
			}
		}
		
		// Printing all the notes 
		System.out.println("The number of 1Rs not you have is : "+note1);
		System.out.println("The number of 2Rs not you have is : "+note2);
		System.out.println("The number of 5Rs not you have is : "+note5);
		System.out.println("The number of 10Rs not you have is : "+note10);			
		System.out.println("The number of 20Rs not you have is : "+note20);
		System.out.println("The number of 50Rs not you have is : "+note50);
		System.out.println("The number of 100Rs not you have is : "+note100);
	}
		
	// calling the main method 	
	public static void main(String args[])
	{	
		// calling the calculateNotesForAmount and passing the amount as argument
		calculateNotesForAmount(Integer.parseInt(args[0]));
	}
}