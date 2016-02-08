package com.sgcib.it.convertor;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConvertor {

	private static final LinkedHashMap<Integer, String> ROMAN_LITERALS = new LinkedHashMap<Integer, String>();

	static {
		ROMAN_LITERALS.put(1000, "M");
		ROMAN_LITERALS.put(900, "CM");
		ROMAN_LITERALS.put(500, "D");
		ROMAN_LITERALS.put(400, "CD");
		ROMAN_LITERALS.put(100, "C");
		ROMAN_LITERALS.put(90, "XC");
		ROMAN_LITERALS.put(50, "L");
		ROMAN_LITERALS.put(40, "XL");
		ROMAN_LITERALS.put(10, "X");
		ROMAN_LITERALS.put(9, "IX");
		ROMAN_LITERALS.put(5, "V");
		ROMAN_LITERALS.put(4, "IV");
		ROMAN_LITERALS.put(1, "I");
	}

	public static String convertNumberToRoman(int number) {
		if (number < 1)
			throw new NumberFormatException(
					"number parameter must be positive.");
		if (number > 3000)
			throw new NumberFormatException("number  must be less than 3001.");
		StringBuilder romanNumber = new StringBuilder();
		int repeat;
		for (Map.Entry<Integer, String> entry : ROMAN_LITERALS.entrySet()) {
			repeat = number / entry.getKey();
			for (int i = 1; i <= repeat; i++) {
				romanNumber.append(entry.getValue());
			}
			number = number % entry.getKey();
		}
		return romanNumber.toString();
	}

}
