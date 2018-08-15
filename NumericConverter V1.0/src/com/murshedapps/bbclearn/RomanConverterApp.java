package com.murshedapps.bbclearn;

import java.util.InputMismatchException;

/**
 * This class prompt user input and pass this as number argument to generate method
 * The input can be validated further at later stage 
 *	@author Murshed
 * 
 */

import java.util.Scanner;

public class RomanConverterApp {

	public static void main(String[] args) throws IllegalArgumentException, InputMismatchException {

		try {

			Scanner keyinput = new Scanner(System.in);
			System.out.println("Entre a number in the range 1 to 3999");
			int number = keyinput.nextInt();
			keyinput.close(); // close stream

			RomanNumeralGenerator rNumerals = new RomanNumeralGenerator();
			String conversion = rNumerals.generate(number);
			System.out.println("The converted Roman Numerals: " + conversion);

		}

		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		catch (InputMismatchException e) {
			System.out.println("The number has to be integer...");
		}

	}

}
