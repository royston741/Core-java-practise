/*
	Program : Wrappers,autoboxing and unboxing	
	@Author : Royston
	@date : 23 September			  
*/

// import all methods from System class
import static java.lang.System.*;

//Creating Wrapper class
class Wrapper{
	// calling main method
	public static void main(String...args){
		// primitive data types
		boolean a=true;
		byte b=1;
		char c='A';
		float d=2.2f;
		int e=3;
		long f=4l;
		short g=5;
		double h=7d;
		
		// autoboxing -> converting primitive data types into object
		Boolean autoBool=a;
		Byte autoByte=b;
		Character autoChar=c;
		Float autoFloat=d;
		Integer autoInt=e;
		Long autoLong=f;
		Short autoShort=g;
		Double autoDouble=h;
		
		// printing
		out.println("---------------- AUTOBOXING ----------------------");
		out.println("The value of Boolean : "+autoBool);
		out.println("The value of Byte : "+autoByte);
		out.println("The value of Character : "+autoChar);
		out.println("The value of Float : "+autoFloat);
		out.println("The value of Integer : "+autoInt);
		out.println("The value of Long : "+autoLong);
		out.println("The value of Short : "+autoShort);
		out.println("The value of Double : "+autoDouble);

		
		// unboxing -> converting object into primitive data types
		boolean privBool=autoBool;
		byte privByte=autoByte;
		char privChar=autoChar;
		float privFloat=autoFloat;
		int privInt=autoInt;
		long privLong=autoLong;
		short privShort=autoShort;
		double privDouble=autoDouble;
		
		// printing
		out.println("\n---------------- UNBOXING ----------------------");
		out.println("The value of Boolean : "+privBool);
		out.println("The value of Byte : "+privByte);
		out.println("The value of Character : "+privChar);
		out.println("The value of Float : "+privFloat);
		out.println("The value of Integer : "+privInt);
		out.println("The value of Long : "+privLong);
		out.println("The value of Short : "+privShort);
		out.println("The value of Double : "+privDouble);

	}// main method ends
	
}// School class ends