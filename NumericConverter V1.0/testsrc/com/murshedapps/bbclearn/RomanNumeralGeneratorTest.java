package com.murshedapps.bbclearn;

/**
 * This is Test class with test cases as assumption to maintain write code in 
 * RomanNumeralGenerator.javs class as test driven
 * @author Murshed
 * 
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralGeneratorTest {
	
	private RomanNumeralGenerator classUnderTest = null;
	
	@Before
	public void setUp() throws Exception {
		classUnderTest = new RomanNumeralGenerator();
	}

	
	@Test
	public void testMin(){
		assertEquals("1 should generate I", "I", classUnderTest.generate(1));
	}
	
	@Test
	public void testMax(){
		assertEquals("3999 MMMCMXCIX", "MMMCMXCIX", classUnderTest.generate(3999));
	}
	
	
	@Test
	public void testMid(){
		assertEquals("1999 should generate MCMXCIX", "MCMXCIX", classUnderTest.generate(1999));
	}
	
	
	@Test
	public void testTooHigh(){
		assertNull("1000000 should generate null", classUnderTest.generate(1000000));
	}
	
	
	@Test
	public void testTooLow() {
		assertNull("-1 should generate null", classUnderTest.generate(-1));
	}
	
	
	@Test
	public void testTwentyFour() {
		assertEquals("24 should generate XXIV", "XXIV", classUnderTest.generate(24));
	}
	
	@Test
	public void testSixHundred() {
		assertEquals("600 should generate DC", "DC", classUnderTest.generate(600));
	}
	
	@After
	public void tearDown() {
		classUnderTest = null;
	}
	
	
	
	
}
