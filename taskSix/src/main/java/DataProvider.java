import java.util.Scanner;


public class DataProvider {
	public static Scanner input = new Scanner(System.in);
	DataTransferObject dataObj = new DataTransferObject();

	String a;
	String b;
	String c;

	DataProvider() {

		System.out.println("Please provide a value: ");
		a = input.nextLine();
		dataObj.setA(a);
		System.out.println("Please provide a value: ");
		b = input.nextLine();
		dataObj.setB(b);
		System.out.println("Please provide a value: ");
		c = input.nextLine();
		dataObj.setC(c);
		System.out.println();
		System.out.println("Provided values are: " + a + " ; " + b + " ; " + c);

	}




}
