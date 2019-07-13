package mytest;
/**
 * Task 11.2. 
 * This class contains a method which takes in a string and two numbers that specify the indexes of a part of the string that you want from the string given.
 * @author Kerusha
 *
 */
public class GetSubStringMethod {
	
	static String getAsubString(String aString, int beginIndex, int endIndex) {
		String subString = aString.substring(beginIndex, endIndex);
		System.out.println("The substring found in the string: " + aString + "\nat indexes: " + beginIndex + "-" + endIndex + " is: " + subString);
		return subString;
	}
}
