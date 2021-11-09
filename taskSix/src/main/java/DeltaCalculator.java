/**
 * @author JANISAD1
 */

import java.util.logging.*;

/**
 * Class that containing all needed calculations for finding square from ax^2+bx+c=0
 */
public class DeltaCalculator {
	private static final Logger LOGGER = Logger.getLogger(DeltaCalculator.class.getName());


	double deltaCal(double a, double b, double c) {


		try {
			LOGGER.setLevel(Level.INFO);
			LOGGER.info("Dalta calculation has been started");
			double delta = Math.pow(b, 2) - 4 * a * c;
			LOGGER.info("delta is: " + delta);
			//System.out.println("Delta is: " + delta);
			return delta;
		}
		catch (Exception e) {
			LOGGER.setLevel(Level.WARNING);
			LOGGER.warning("there was problem with delta calculation. Delta will be returned as -1");
			return -1;
		}


	}


	String deltaLess() {

		LOGGER.setLevel(Level.INFO);
		LOGGER.info("deltaLess method started");
		String infoText = "No real roots";
		return infoText;
	}


	double deltaMore1(double a, double b, double delta) {

		try {
			LOGGER.setLevel(Level.INFO);
			LOGGER.info("delta was more then 0 - first x was calculated");
			double x = (-b - (Math.sqrt(delta))) / (2 * a);
			x = Math.round(x * 100.0) / 100.0;
			//System.out.println("X1 is: " + x);
			return x;
		}
		catch (Exception e) {
			LOGGER.setLevel(Level.WARNING);
			LOGGER.warning("X was imposible to calculated. It will be set as 0");
			return 0;
		}


	}


	double deltaMore2(double a, double b, double delta) {

		try {
			LOGGER.setLevel(Level.INFO);
			LOGGER.info("delta was more than 0 - secund x was calculated");
			double x = (-b + (Math.sqrt(delta))) / (2 * a);
			x = Math.round(x * 100.0) / 100.0;
			//System.out.println("X2 is: " + x);
			return x;
		}
		catch (Exception e) {
			LOGGER.setLevel(Level.WARNING);
			LOGGER.warning("X was imposible to calculated. It will be set as 0");
			return 0;
		}


	}


	double deltaEqual(double a, double b, double delta) {
		try {
			LOGGER.setLevel(Level.INFO);
			LOGGER.info("deltaEqual method in delta.java");
			double x = -b / (2 * a);
			//System.out.println("X is: " + x);
			return x;
		}
		catch (Exception e) {
			LOGGER.setLevel(Level.WARNING);
			LOGGER.warning("There were no possiblity to ");
			return -1;
		}
	}


	static double convertToDouble(String str) {
		String tmpString = str.replace(',', '.');

		try {
			LOGGER.setLevel(Level.INFO);
			LOGGER.info("checking if string can be converted to double");
			Double.parseDouble(tmpString);
			double newNum = Double.parseDouble(tmpString);
			return Math.round(newNum * 100.0) / 100.0;

		}
		catch (NumberFormatException e) {
			LOGGER.setLevel(Level.WARNING);
			LOGGER.warning("There was no possibility to convert string into double value.");
			LOGGER.warning("Provided value is not correct. It will be replaced by 0");
			return 0;
		}
	}


}
