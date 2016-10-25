package com.ulta.merchandise.dashboard.spring.util;

import java.math.BigDecimal;

public class Conversions {

	
	/**
	 * Determines if a String is a number in scientific notation
	 * @param numberString
	 * @return true or false
	 */
	public boolean isScientificNotation(String numberString) {
		
		// Validate the number
		try {
			
			new BigDecimal(numberString);
			
		}
		catch (NumberFormatException nfe) {
			
			return false;
			
		}
		
		
		// Check if scientific notation
		return numberString.toUpperCase().contains("E");
		
	}
	
	
	/**
	 * Convert a string to BigDecimal
	 * @param numberString
	 * @return BigDecimal
	 * @throws NumberFormatException
	 */
	public BigDecimal convertStringToBigDecimal(String numberString) throws NumberFormatException {
		
		BigDecimal bd = new BigDecimal(numberString);
		
		return bd;
		
	}
	
}
