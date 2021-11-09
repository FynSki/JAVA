/***
 * Object that validate if values abc can be change to double.
 */

import java.util.logging.*;

/**
 * class that validate string and check if it can be convert into double
 */
public class Validator {

	String a;
	String b;
	String c;

	private static final Logger LOGGER = Logger.getLogger(Validator.class.getName());

	Validator(){

	}
	Validator(String paramA, String paramB, String paramC) {

		a = paramA.replace(',', '.');
		b = paramB.replace(',', '.');
		c = paramC.replace(',', '.');

	}

	double Validator(String paramToValid) {
		LOGGER.info("checking if String can be change to double");
		paramToValid = paramToValid.replace(',', '.');
		try {
			Double.parseDouble(paramToValid);
			double newNum = Double.parseDouble(paramToValid);
			LOGGER.info("Double was correctly created: " + newNum);
			return Math.round(newNum * 100.0) / 100.0;
		}
		catch (NumberFormatException e) {
			LOGGER.warning("There was no possibility to change string into double. It will be change to 0");
			return 0;
		}

	}

}
