import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final String sentence = "Ich esse Tomaten aus dem Garten";
        System.out.println(reverseWords(sentence));
        System.out.println(reverseWordsOneLiner(sentence));
    }

    public static String reverseWords(String sentence) {
        final String[] words = sentence.split("\\s");
        final String[] reversed = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            reversed[i] = words[words.length - i - 1];
        }

        String result = "";
        for (int i = 0; i < reversed.length; i++) {
            result = result + reversed[i] + " ";
        }
        return result;
        // return String.join(" ", reversed);
    }

    public static String reverseWordsOneLiner(String sentence) {
        return String.join(" ", Arrays.asList(sentence.split("\\s")).reversed());
    }

}
