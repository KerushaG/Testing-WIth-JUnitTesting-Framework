package mytest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Task 11.2.
 * This tests the GetSubStringMethod class and its' method getAsubString which takes in a string and the indexes of the substring, to test it against expected and actual outcomes. 
 * @author Kerusha Govender, 28 June 2019
 *
 */
class GetSubStringMethodTest {

	@Test
	public void testgetAsubString() {
		String actualOutcome = GetSubStringMethod.getAsubString("The new Charlies Angels trailer just got released", 8, 23);
		String expectedOutcome = "Charlies Angels";
		assertEquals(actualOutcome, expectedOutcome);
	}
	void test() {
		fail("Not yet implemented");
	}
}
