package org.psl.performance.services;

import java.math.BigInteger;

/**
 * Escala sin problema
 */
public class MultiplyService {
	public int multiply (String numberA, String numberB) {
		return new BigInteger(numberA).multiply(new BigInteger(numberB)).intValue();
	}
}
