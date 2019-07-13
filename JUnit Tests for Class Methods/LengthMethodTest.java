package mytest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Task 11.2.
 * This tests the LengthMethod class's method findLengthOfString which finds and returns the length of a string.
 * @author Kerusha Govender, 28 June 2019
 *
 */
class LengthMethodTest {
	
	@Test
	public void testFindLengthOfString() {
		int actualOutcome = LengthMethod.findLengthOfString("Kerusha Govender");
		int expectedOutcome = 16;
		assertEquals(actualOutcome, expectedOutcome);
	}

	void test() {
		fail("Not yet implemented");
	}
}
