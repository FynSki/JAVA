/**
 * Main Class in the calculation of the ax^2+bx+c=0
 *
 * @author Adam Janiszewski
 */

public class Main {


	public static void main(String[] args) {
		DataProvider dataProv = new DataProvider();
		//DataTransferObject calculation = new DataTransferObject();
		Validator valid = new Validator(dataProv.dataObj.a , dataProv.dataObj.b , dataProv.dataObj.c);
		//Validator valid = new Validator(calculation.a, calculation.b, calculation.c);
		SqrRootResolv sqrRootResolv = new SqrRootResolv(valid.Validator(valid.a), valid.Validator(valid.b) , valid.Validator(valid.c) );
		System.out.println("Solution is: " + sqrRootResolv.SqrRootResolv());
	}


}
