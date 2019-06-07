package org.psl.performance.services.utilities;

public class NumericUtilities {
	public static synchronized boolean isZero (int number) {
		try{	
			Thread.sleep(1);
		} catch (InterruptedException iiee) {
			iiee.printStackTrace();
		}
		
		if (number == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void giveMeABreak(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException iiee) {
			iiee.printStackTrace();
		}
	}
}
