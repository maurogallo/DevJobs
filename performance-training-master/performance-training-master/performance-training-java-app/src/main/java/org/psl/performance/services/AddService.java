package org.psl.performance.services;

import java.math.BigInteger;

import org.psl.performance.services.utilities.NumericUtilities;

/**
 * Es lenta pero escala porque a diferencia de la división no depende de un método sincronizado
 */
public class AddService {
	public int add (String numberA, String numberB) {
		NumericUtilities.giveMeABreak(50);
		return new BigInteger(numberA).add(new BigInteger(numberB)).intValue();
	}
}