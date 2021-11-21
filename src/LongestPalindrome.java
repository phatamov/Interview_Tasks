public class LongestPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam codedoc hello wow azerbaijan viviviviviv"));
    }

    public static String isPalindrome(String str) {

        String[] split = str.split(" ");
        String s;
        String palindrome = "";
        String longestPalindrome = "";

        for (String word : split) {
            s = "";
            palindrome = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                s += word.charAt(j);
            }
            if (s.equalsIgnoreCase(word)) {
                palindrome += s + " ";

            }
            if (palindrome.length() > longestPalindrome.length()) {
                longestPalindrome = palindrome;
            }
        }
        return longestPalindrome.toLowerCase();
    }
}
