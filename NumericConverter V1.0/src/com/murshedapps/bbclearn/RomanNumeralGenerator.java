package com.murshedapps.bbclearn;

/**
 * This class implement the interface RomanNumeralGeneratorI and implement generate() 
 * method
 * 
 * @author Murshed
 * 
 */


import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class RomanNumeralGenerator implements RomanNumeralGeneratorI {

	private static final Integer Max = 3999;
	private static final Integer Min = 1;

	private TreeMap<Integer, String> numericToRomanMap = null;

	NavigableMap<Integer, String> getRomanMap() {
		if (numericToRomanMap == null) {
			initRomanMap();
		}

		return numericToRomanMap.descendingMap();

	}

	private void initRomanMap() {
		numericToRomanMap = new TreeMap<Integer, String>();

		numericToRomanMap.put(1, "I");
		numericToRomanMap.put(4, "IV");
		numericToRomanMap.put(5, "V");

		numericToRomanMap.put(9, "IX");
		numericToRomanMap.put(10, "X");
		numericToRomanMap.put(40, "XL");
		numericToRomanMap.put(50, "L");
		numericToRomanMap.put(90, "XC");
		numericToRomanMap.put(100, "C");
		numericToRomanMap.put(200, "CC");
		numericToRomanMap.put(400, "CD");
		numericToRomanMap.put(500, "D");
		numericToRomanMap.put(900, "CM");
		numericToRomanMap.put(1000, "M");

	}

	/* convert an integer to Roman Numeral */

	public String generate(int number) {

		if (number < Min || number > Max)
			return null;

		StringBuilder romanNumeral = new StringBuilder();
		NavigableMap<Integer, String> romanMap = getRomanMap();
																// searching navigablemap
		for (Map.Entry<Integer, String> entry : romanMap.entrySet()){
			
				Integer key = entry.getKey();
				String value = entry.getValue();
			
				while (number >=key){
					number -= key;
					romanNumeral.append(value);
					
				}
		
		}

		return romanNumeral.toString();

}	


 
 
}