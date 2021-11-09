import java.util.Scanner;
import java.util.logging.*;

/**
 * gathering and storing information from the user
 */
public class DataTransferObject {
	// perfect DTO should be unmutable?
	// it's not good to have publics - every other object has possibility to break this object
	// there should be constructor having 3 arguments and 3 getters method
	// maybe here validation should be done
	// this should only store the data, no need to have input here
	// it is more ValueObject rather than DataTransferObject

	public static Scanner input = new Scanner(System.in);
	public String a;
	public String b;
	public String c;


	String setA(String newString)
	{
		a = newString;
		return a;
	}

	String setB(String newString)
	{
		b = newString;
		return a;
	}

	String setC(String newString)
	{
		c = newString;
		return a;
	}



}
