package mytest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Task 11.1
 * This is a test class that tests the isPrime Method from the PrimeNumberMethod class, by giving it a value and comparing the actual and expected outcomes.
 * @author Kerusha Govender, 28 June 2019
 *
 */
class PrimeNumberMethodTest {

	@Test
	public void testPrimeNumberMethod () {
		boolean actualOutcome = PrimeNumberMethod.isPrime(7);
		boolean expectedOutcome = true;
		assertEquals(actualOutcome, expectedOutcome);
	}
	void test() {
		fail("Not yet implemented");
	}
}
