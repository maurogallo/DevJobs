package org.psl.performance.services;

import java.math.BigInteger;

import org.psl.performance.services.utilities.NumericUtilities;

/**
 * No escala porque depende de un método sincronizado
 */
public class DivideService {
	public int divide (String numberA, String numberB) {
		
		if (!NumericUtilities.isZero(new BigInteger(numberB).intValue())) {
			return new BigInteger(numberA).divide(new BigInteger(numberB)).intValue();
		} else {
			throw new RuntimeException("Can't divide by zero");
		}
	}
}
