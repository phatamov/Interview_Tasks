import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(anagram("silent", "listen"));
    }

    public static boolean anagram(String str1, String str2){
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
