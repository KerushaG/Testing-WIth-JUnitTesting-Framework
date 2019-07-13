package mytest;
/**
 * Task 11.2. 
 * This class just has a method that takes in a string and returns the length of it.
 * @author Kerusha Govender, 28 June 2019
 *
 */
public class LengthMethod {
	
	static int findLengthOfString(String aString) {
		int stringLength = aString.length();
		System.out.println("The length of the string:\n" + aString + "\nis " + aString.length());
		return stringLength;
	}
}
