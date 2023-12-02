package veer.com;

public class Palidromstring {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string="NITIN";
  //string = string.toLowerCase();
  String string2="";
  for(int i=string.length()-1;i>=0;i--) {
	  string2=string2+string.charAt(i);
  }
  if(string.equals(string2)) {
	  System.out.print(string+ " palnidrom string"); 
  }else {
	  System.out.print(string + " palnid not");
  }
	

}
		
}
		
		
		
		
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // Java program to check whether a
// string is a Palindrome
// Using two pointing variables

// Main class
public class GFG {

	// Method
	// Returning true if string is palindrome
	static boolean isPalindrome(String str)
	{

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

	// Method 2
	// main driver method
	public static void main(String[] args)
	{
		// Input string
		String str = "geeks";

		// Convert the string to lowercase
		str = str.toLowerCase();
		// passing bool function till holding true
		if (isPalindrome(str))

			// It is a palindrome
			System.out.print("Yes");
		else

			// Not a palindrome
			System.out.print("No");
	}
}
/*
 * 
 * 
 * 
 * 
 * 
 * // Java Program to check Whether
// the String is Palindrome
// or Not

// Main class
class GFG {

	// Method 1
	// Returns true if string is a palindrome
	static boolean isPalindrome(String str)
	{

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters to compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

	// Main driver method
	public static void main(String[] args)
	{
		String str = "geeks";
		String str2 = "RACEcar";

		// Change strings to lowercase
		str = str.toLowerCase();
		str2 = str2.toLowerCase();

		// For string 1
		System.out.print("String 1 :");

		if (isPalindrome(str))
			System.out.print("It is a palindrome");
		else
			System.out.print("It is not a palindrome");

		// new line for better readability
		System.out.println();

		// For string 2
		System.out.print("String 2 :");
		if (isPalindrome(str2))
			System.out.print("It is a palindrome");
		else
			System.out.print("It is not a palindrome");
	}
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * // Java Program to implement
// Basic Approach to check if
// string is a Palindrome
import java.io.*;

// Driver Class
class GFG {
	// main function
	public static boolean isPalindrome(String str)
	{
		// Initializing an empty string to store the reverse
		// of the original str
		String rev = "";

		// Initializing a new boolean variable for the
		// answer
		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		// Checking if both the strings are equal
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args)
	{
		// Input string
		String str = "geeks";

		// Convert the string to lowercase
		str = str.toLowerCase();
		boolean A = isPalindrome(str);
		System.out.println(A);
	}
}

 * 
 * 
 * 
 * 
 * 
 * 
 * **
 */
 
		
	

		  /*  public static boolean isPalindrome(String str) {
		        // Remove non-alphanumeric characters and convert to lowercase
		        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		        // Check if the string is a palindrome
		        int left = 0;
		        int right = str.length() - 1;
		        
		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false; // Characters do not match, not a palindrome
		            }
		            left++;
		            right--;
		        }
		        return true; // If the loop completes, it's a palindrome
		    }

		    public static void main(String[] args) {
		        // Test cases
		        System.out.println(isPalindrome("racecar")); // Output: true
		        System.out.println(isPalindrome("hello"));   // Output: false
		        System.out.println(isPalindrome("level"));   // Output: true
		    }
		}

*/



/*



// Java Program to Find all palindromic sub-strings 
// of a given string

// Importing input output classes
import java.io.*;

// Main class
// To check for palindromic sub-strings
public class GFG {

	// Method 1
	// To check for substring
	public static boolean check(String subS)
	{
		int size = subS.length();

		// Iterating over string till midway to
		// check palindromic behavior
		for (int i = 0; i < size / 2; i++) {

			if (subS.charAt(i)
				!= subS.charAt(size - i - 1)) {

				// Non-palindromic behavior
				return false;
			}
		}

		// Palindromic behavior
		return true;
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		// Custom input string
		String str = "MALAYALAM";

		int count = 0;

		// Outer loop iterating over input string
		for (int i = 0; i < str.length(); i++) {

			// Inner loop iterating from current starting
			// character of outer loop current starting
			// character
			for (int j = i; j < str.length(); j++) {

				// Getting the substrings
				String subString = str.substring(i, j + 1);

				// Checking whether the substring is
				// palindrome
				if (check(subString)) {

					// Increment the count only if
					// substring is palindrome
					count++;
				}
			}
		}

		// Print and display the number of substrings that
		// are palindromic
		System.out.println(
			"No.of palindromic substrings in the given string are "
			+ count);
	}
}





class PalindromeSubStrings{
  public static int findPalindromesInSubString(String input, int j, int k) {
    int count = 0;
    for (; j >= 0 && k < input.length(); --j, ++k) {
      if (input.charAt(j) != input.charAt(k)) {      
        break;
      } 
      System.out.println(input.substring(j, k+1));
      count++;
    }
    return count;
  }

  public static int findAllPalindromeSubstrings(String input) {
    int count = 0;
    for(int i = 0 ; i < input.length() ; ++i) {
      count+= findPalindromesInSubString(input, i-1, i+1);
      count+= findPalindromesInSubString(input, i, i+1);
    }

    return count;
  }

  public static void main(String[] args) {
    String str = "aabbbaa";
    int count = findAllPalindromeSubstrings(str);
    System.out.println("Total palindrome substrings: " + count);
  }
}  









*/