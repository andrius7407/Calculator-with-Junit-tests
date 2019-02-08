import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc = new Calculator();
	
	@Test
	public void testSubtractionOfTwoNumbers(){
		//Calculator calc = new Calculator();
		double firstNumber = 10;
		double secondNumber = 5;		
		
		assertEquals(4, calc.subtract(firstNumber, secondNumber), 0);
	} 
	
	@Test
	public void testMultiplicationOfTwoNumbers(){
		double firstNumber = 5;
		double secondNumber = 5;		
		
		double result = calc.multiply(firstNumber, secondNumber);
		
		assertEquals(25, result, 0);
	} 
	
	@Test
	public void testDivision(){
		double firstNumber = 27;
		double secondNumber = 8;		
		
		assertEquals(3, calc.divide(firstNumber, secondNumber), 0);
	}
}
