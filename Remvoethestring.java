package veer.com;


	// Java program to create a unique String using unordered_map

	/* access time in unordered_map on is O(1) generally if no collisions occur 
	and therefore it helps us check if an element exists in a String in O(1) 
	time complexity with constant space. */
	import java.util.*;

	public class Remvoethestring{ 
		
	/*static char[] removeDuplicates(char []s,int n){
	Map<Character,Integer> exists = new HashMap<>();

	String st = "";
	for(int i = 0; i < n; i++){
		if(!exists.containsKey(s[i]))
		{
		st += s[i];
		exists.put(s[i], 1);
		}
	}
	return st.toCharArray();
	}

	// driver code
	public static void main(String[] args){
	char s[] = "geeksforfffffddddgeeks".toCharArray();
	int n = s.length;
	System.out.print(removeDuplicates(s,n));
	}
	}

*/

//public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Check if the character is already in the result string
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "hello";
        String result = removeDuplicates(inputString);
        System.out.println(result);
    }
}
