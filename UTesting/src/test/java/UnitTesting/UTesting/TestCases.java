package UnitTesting.UTesting;

import org.junit.Test;

import junit.framework.TestCase;

public class TestCases extends TestCase {

	
	@Test
	public void testFunction(){
		MainClass MClass = new MainClass();
		int output = MClass.functionToTest(2, 5);
		if (output != 7) {
			fail("Test Failed.");
		}
		
	}
}
