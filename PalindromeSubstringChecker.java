package javaproject1;

public class PalindromeSubstringChecker {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void findAllPalindromeSubstrings(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String subString = input.substring(i, j);
                if (isPalindrome(subString) && subString.length() > 1) {
                    System.out.println( subString);
                }
            }
        }
    }

    public static void main(String[] args) {
        String str = "nitin"; 
        findAllPalindromeSubstrings(str);
    }
}
