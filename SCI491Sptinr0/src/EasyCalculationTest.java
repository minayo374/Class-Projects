import static org.junit.Assert.*;

import org.junit.Test;

public class EasyCalculationTest {

	@Test
	public void testAdd() {
		EasyCalculation calc = new EasyCalculation();
		int result = calc.Add(3, 4);
		assertEquals(7, result);
	}
	
	@Test
	public void testSub() {
		EasyCalculation calc = new EasyCalculation();
		int result = calc.Sub(5, 2);
		assertEquals(3, result);
	}

}
