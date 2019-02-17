import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DivisionTest{
	
	Calculator calc = new Calculator();
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{1, 2, 1.5}, {3, 2, 1.5}, {5, 2.5, 2}, {10, 3, 3}
		});
	}
	
	@Parameter
	public double first;
	
	@Parameter(1)
	public double second;
	
	@Parameter(2)
	public double fExpected;
	
	@Test
	public void test(){
		assertEquals(fExpected, calc.divide(first, second), 0);
	}
}
