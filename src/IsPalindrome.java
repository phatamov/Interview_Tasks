public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome2("Madam is mem"));
    }

    public static boolean isPalindrome(String str){

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
        return str.equalsIgnoreCase(reverse);
    }

    public static String isPalindrome2(String str){

        String [] split = str.split(" ");
        String s;
        String palindrome = "";

        for (String word : split) {
            s = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                s += word.charAt(j);
            }
            if (s.equalsIgnoreCase(word))
                palindrome += s + " ";
        }
        return palindrome.toLowerCase();
    }
}