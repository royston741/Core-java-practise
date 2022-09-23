/*
	program : Break and continue program 
	@author : Royston
	@date : 13 September	
*/

// import all methods from System class
import static java.lang.System.*;

// Creating a class named BreakAndContinue
class BreakAndContinue
{
	// Creating a breakMethod method
	static void breakMethod(int number){
		// running the loop 
		for(int i=1;i<10;i++){
			// if the iteration is equal to number than break
			if(i==number){
				out.println("Breaking at "+number);
				break;
			}
			// printing the iteration 
			out.println(i);
		}
	}
	
	
	// Creating a continueMethod method
	static void continueMethod(int number){
		// running the loop 
		for(int i=1;i<10;i++){
			// if the iteration is equal to number than skip the iteration 
			if(i==number){
				continue;
			}
			// printing the iteration 
			out.println(i);
		}
	}
	
	// Creating a LabledBreakMethod method
	static void labledBreakMethod(){
		
		// running the loop 
		outerLoop : for(int i=1;i<4;i++){
			out.println("");
			// running the inner loop
			for(int j=1;j<4;j++){
				// if the i is equal to j than break 
				if(i==j){
					// using label to break out of the outer loop
					break outerLoop;
				}
				out.print(i+""+j+" ");
			}
		}
	}
	
	// Creating a LabledContinueMethod method
	static void labledContinueMethod(){
		
		// running the loop 
		outerLoop : for(int i=1;i<4;i++){
			out.println("");
			// running the inner loop
			for(int j=1;j<4;j++){
				// if the i is equal to j than continue
				if(i==j){
					// using label to continue to the outer loop
					continue outerLoop;
				}
				out.print(i+""+j+" ");
			}
		}
	}
	
	// calling main method
	public static void main(String...args){
		// taking a input 
		int number =Integer.parseInt(args[0]);
		
		// calling breakMethod method and passing argument
		//breakMethod(number);
		
		// calling continueMethod method and passing argument
		//continueMethod(number);
		
		// calling labledBreakMethod method and passing argument
		//labledBreakMethod();
		
		// calling labledContinueMethod method and passing argument
		labledContinueMethod();
	}

}