package kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void StringCalculatorShouldReturnZeroWithEmptyStringParam() {

		// Given
		StringCalculator s = new StringCalculator();

		// WHEN
		int somme = s.add("");

		// THEN
		assertEquals(0, somme);		
	}
	
	@Test
	public void StringCalculatorShouldReturnTheResultWithOnlyOneParam() {

		// Given
		StringCalculator s = new StringCalculator();

		// WHEN
		int somme = s.add("5");

		// THEN
		assertEquals(5, somme);		
	}	

	@Test
	public void StringCalculatorShouldReturnTheResultWithTwoParam() {

		// Given
		StringCalculator s = new StringCalculator();

		// WHEN
		int somme = s.add("5,8");

		// THEN
		assertEquals(13, somme);		
	}		

	@Test
	public void StringCalculatorShouldReturnTheResultWithSpacedParams() {

		// Given
		StringCalculator s = new StringCalculator();

		// WHEN
		int somme = s.add("5, 8");

		// THEN
		assertEquals(13, somme);		
	}		
}
