package mytest;
/*
 * Task 11.2.
 * This class has a method which given a string and a substring, finds the index at which the substring starts.
 * Kerusha Govender, 28 June 2019
 */
public class FindIndexInAstringMethod {
	
	static int findIndexOfSubString(String aString, String subString) {
		int index = aString.indexOf(subString);
		System.out.println("The index of 25 starts at " + index + " in the string.");
		return index;
	}
}
