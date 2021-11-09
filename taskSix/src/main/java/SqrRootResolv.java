/**
 * Class that based on dela value provides reasult
 */

import java.util.logging.*;

public class SqrRootResolv {

	double deltaRes;
	double x;
	double x1;
	double x2;
	String noRes;

	DeltaCalculator nDelta = new DeltaCalculator();
	private static final Logger LOGGER = Logger.getLogger(SqrRootResolv.class.getName());

	SqrRootResolv(double paramA, double paramB, double paramC) {
		LOGGER.info("Start calculating Delta");

		deltaRes = nDelta.deltaCal(paramA, paramB, paramC);
		LOGGER.info("Delta was calculated: " + deltaRes);
	
		noRes = nDelta.deltaLess();

		LOGGER.info("Start calculating X");
		x = nDelta.deltaEqual(paramA, paramB, deltaRes);
		LOGGER.info("X for one resolution is: " + x);

		x1 = nDelta.deltaMore1(paramA, paramB, deltaRes);
		x2 = nDelta.deltaMore2(paramA, paramB, deltaRes);
		LOGGER.info("X1 and X2 for two resolutions are: " + x1 + " and " + x2);
	}

	// It can be hard to test - return String
	// Maybe it will be good to return Array
	String SqrRootResolv() {
		if (deltaRes > 0) {
			return ("X1=" + x1 + " , X2=" + x2);
		}
		else if (deltaRes == 0) {
			return "X =" + x;
		}
		else {
			return noRes;
		}
	}

	String SqrRootResolv(double paramA, double paramB, double paramC){

		LOGGER.info("Start calculating Delta");

		deltaRes = nDelta.deltaCal(paramA, paramB, paramC);
		LOGGER.info("Delta was calculated: " + deltaRes);

		noRes = nDelta.deltaLess();

		if (deltaRes > 0) {
			x1 = nDelta.deltaMore1(paramA, paramB, deltaRes);
			x2 = nDelta.deltaMore2(paramA, paramB, deltaRes);
			LOGGER.info("X1 and X2 for two resolutions are: " + x1 + " and " + x2);
			return ("X1=" + x1 + " , X2=" + x2);
		}
		else if (deltaRes == 0) {
			LOGGER.info("Start calculating X");
			x = nDelta.deltaEqual(paramA, paramB, deltaRes);
			LOGGER.info("X for one resolution is: " + x);
			return "X =" + x;
		}
		else {
			return noRes;
		}
	}

}
