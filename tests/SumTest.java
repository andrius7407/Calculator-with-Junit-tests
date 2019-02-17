import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) 
public class SumTest{
	private double firstNumber;
	private double secondNumber;
	private double expectedResult;
	private Calculator calc;
	
	@Before
	public void initialize(){
		calc = new Calculator();
	}
	
	public SumTest(double firstNumber, double secondNumber, double expectedResult){
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
			{1, 2, 3}, 
			{3, 2, 1.5}, 
			{5, 2.5, 2}, 
			{10, 3, 13}
		});
	}
	
	@Test
	public void testSum(){
		assertEquals(expectedResult, calc.sum(firstNumber, secondNumber), 0);
	}
}
