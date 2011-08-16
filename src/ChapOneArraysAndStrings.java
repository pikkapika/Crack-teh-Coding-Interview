
public class ChapOneArraysAndStrings {
	/**
	 * 1.1 Implement an algorithm to determine if a string has all unique 
	 * characters. What if you can not use additional data structures?
	 *   use array to store flag
	 */
	public static boolean isUniqueChars2(String str)
	{
		boolean[] char_set = new boolean[256];
		for(int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i);
			if(char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	/**
	 * 1.1 Implement an algorithm to determine if a string has all unique 
	 * characters. What if you can not use additional data structures?
	 *   use bit to store flag
	 */
	public static boolean isUniqueChars(String str)
	{
		int checker = 0;
		for(int i=0; i<str.length(); ++i)
		{
			int val = str.charAt(i) - 'a';
			if((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	
	/**
	 * 1.2 Write code to reverse a C-Style String. (C-String means that 
	 * ÒabcdÓ is represented as five characters, including the null character.)
	 */
	public static String reverseString(String str)
	{
		return "";
	}
	
	/**
	 * Design an algorithm and write code to remove the duplicate characters in 
	 * a string without using any additional buffer. NOTE: One or two additional
	 *  variables are fine. An extra copy of the array is not.
	 * FOLLOW UP Write the test cases for this method.
	 */
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		System.out.println(isUniqueChars("est"));
	}
}
