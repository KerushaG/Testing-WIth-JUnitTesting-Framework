package mytest;
/**
 * Task 11.2. 
 * This class contains a method that returns the value that lies at a specified index of a string.
 * @author Kerusha Govender, 28 June 2019
 *
 */
public class FindCharValueMethod {
	
	static char findCharValueAtThisIndex(String aString, int index) {
		char charValue = aString.charAt(index);
		if(charValue == ' ' || charValue == '\n') { //in case the index happens to come across a blank which could mean a space or a new line
			charValue = 0;
			System.out.println("There is a space at the specified string index");
			return charValue;
		}
		System.out.println("The value in the string at index " + index + " is: " + charValue);
		return charValue;
	}
}
