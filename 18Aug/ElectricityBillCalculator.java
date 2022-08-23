/*
	Program: Program for electricity bill calculation
	@author: Royston
	@Date  : 18 August 
*/

// Declaring a class named ElectricityBillCalculator
class ElectricityBillCalculator{
	
	// Creating a calculate bill method 
	static void calculateBill(float numOfUnits){
		
		// Storing the bill amount in a variable
		double billAmount=0;
		
		// if the number of units is less than or equal to 50
		if(numOfUnits<=50){
			// the bill amount will be the number of units multiply by 0.50
			billAmount=numOfUnits*0.50;
		}
		// if the number of units is less than or equal to 150
		else if(numOfUnits<=150){
			// the bill amount will be the bill amount of first 50 units i.e. 25 + number of remaining units multiply by 0.75
			billAmount=25+((numOfUnits-50)*0.75);
		}
		// if the number of units is less than or equal to 250
		else if(numOfUnits<=250){
			// the bill amount will be the bill amount of first 150 units i.e. 100 + number of remaining units multiply by 1.20
			billAmount=100+((numOfUnits-150)*1.20);
		}
		// if the number of units is greater than 250
		else{
			// the bill amount will be the bill amount of first 250 units i.e. 220 + number of remaining units multiply by 1.50
			billAmount=220+((numOfUnits-250)*1.50);
		}
	
		// Adding 20 percent of surcharge to the bill amount
		billAmount=billAmount+(billAmount*0.20);
		
		// Printing the bill amount
		System.out.println("Your bill amounnt for " + numOfUnits + "units is : " + billAmount );	
	}
	
	// Calling the main method
	public static void main(String args[]){
		
		//calling the calculate bill funtion and passing the unnits as arguments
		calculateBill(Integer.parseInt(args[0]));
	}
}