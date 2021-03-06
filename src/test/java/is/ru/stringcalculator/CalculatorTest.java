package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
    public void testMultipleNumbers() {
    	assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test
	public void testNewLineNumbers() {
		assertEquals(3, Calculator.add("1\n2"));
	}

   @Test
	public void testNumbersBiggerThan1000() {
		assertEquals(2, Calculator.add("1001,2"));
	} 

	@Test
	public void testNegativeNumber() throws RuntimeException{
		Calculator.add("-1");
	} 

	@Test
	public void testNegativeNumbers() throws RuntimeException{
		try {
			Calculator.add("-1,2");
		} catch (RuntimeException ex) {
			assertEquals("Negatives are not allowed: [-1]", ex.getMessage());

		}
	} 



	/*@Test
    public void testNegativeNumbers(){
    	try {
    		Calculator.add("-2, 1");
    	} catch (RuntimeException e){
    		assertEquals("Negatives are not allowed: -2", e.getMessage());
    	}
    }*/



}