package mytest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 * Task 11.2.
 * This tests the FindIndexInAstringMethod class with the method findIndexOfSubString and compares the actual outcome with the expected outcome.
 * Kerusha Govender, 28 June 2019
 */
class FindIndexInAstringMethodTest {

	@Test
	public void testfindIndexOfSubString() {
		int actualOutcome = FindIndexInAstringMethod.findIndexOfSubString("He is turning 25 in July", "25");
		int expectedOutcome = 14;
		assertEquals(actualOutcome, expectedOutcome);
	}
	void test() {
		fail("Not yet implemented");
	}
}
