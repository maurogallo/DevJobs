package org.psl.performance.services;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Consume mucha memoria y no la libera
 * porque en cada llamado agrega n elementos
 * a la lista que está como variable estática de
 * la clase
 */
public class SubtractService {
	private static List<int[]> myList = new ArrayList<>();
	public int subtract (String numberA, String numberB) {
		myList.add(new int[1000]);
		
		return new BigInteger(numberA).subtract(new BigInteger(numberB)).intValue();
	}
}
