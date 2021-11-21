public class StringReverseEachWord {

    public static void main(String[] args) {
        reverseWords("My name is Paul");
    }

    public static void reverseWords(String sentence){
        String[] split = sentence.split(" ");
        String reversedSentences = "";
        for (String each : split) {
            reversedSentences += new StringBuilder(each).reverse() + " ";
        }
        System.out.println(reversedSentences);
    }
}
