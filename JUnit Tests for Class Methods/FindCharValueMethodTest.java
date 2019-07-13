package mytest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Task 11.2.
 * This class tests the FindCharValue class method findCharValueAtThisIndex by passing in values and comparing it with the expected outcome.
 * @author Kerusha Govender, 28 June 2019
 *
 */
class FindCharValueMethodTest {

	@Test
	public void testfindCharValueAtThisIndex() {
		char actualOutcome = FindCharValueMethod.findCharValueAtThisIndex("The Late Late Show with James Corden", 24);
		char expectedOutcome = 'J';
		assertEquals(actualOutcome,expectedOutcome);
	}
	void test() {
		fail("Not yet implemented");
	}
}
