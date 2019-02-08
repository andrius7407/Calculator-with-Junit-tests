import static org.junit.Assert.*;

import org.junit.Test;

public class HelpTest{
	
	Calculator calc = new Calculator();
	
	public String expected = "Naudojimo instrukcija:" +
		"\niveskite skaicius skaicius zenklas(+, -, *, /,)." +
		"\nZenkla * iveskite kabutese.\nDalyba is nulio - negalima.";
	
	@Test
	public void testHelp(){
		System.out.println("ok5");
		assertEquals(expected, calc.help());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ifSecondNumberIsZeroShouldThrowException(){
		
		System.out.println("ok");
		calc.divide(2, 0);
		
	}
}
