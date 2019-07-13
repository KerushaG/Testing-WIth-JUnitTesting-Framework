package mytest;
/**
 * Task 11.1
 * This class contains a method that takes in a number and lets you know if its a prime number or not.
 * @author Kerusha Govender, 28 June 2019
 *
 */
public class PrimeNumberMethod {
//I test the number with % from 2 to itself, if at any point it divides without remainders, it gets disqualified.	
	static boolean isPrime(int num) {
		if(num == 0 || num == 1) {
			System.out.println("No " + num + " is NOT a prime number");
		}
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				System.out.println("No " + num + " is NOT a prime number");
				return false;
		    }
		}
		System.out.println("Yes " + num + " is a prime number.");
		return true;
	}
}
