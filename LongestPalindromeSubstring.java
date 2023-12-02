package veer.com;

public class LongestPalindromeSubstring {

    public static String findLongestPalindromeSubstring(String input) {
        if (input == null || input.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < input.length(); i++) {
            int len1 = expandAroundCenter(input, i, i);
            int len2 = expandAroundCenter(input, i, i + 1);
            int maxLength = Math.max(len1, len2); 

            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2; 
                end = i + maxLength / 2;
            }
        } 

        return input.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String str = "google";
        String longestPalindrome = findLongestPalindromeSubstring(str);
        System.out.println("Longest palindrome substring is: " + longestPalindrome);
    }
}
