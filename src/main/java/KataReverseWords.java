import java.util.ArrayList;
import java.util.List;

public class KataReverseWords {

    public static String reverseWords(final String original) {

        String[] words = original.split(" ");
        List<String> reversedwords = new ArrayList<>();
        for (String word : words) {
            List<String> reverseLetters = new ArrayList<>();
            String[] letters = word.split("");
            for (int i = letters.length - 1; i > -1; i--) {
                reverseLetters.add(letters[i]);
            }
            String reverseWord = String.join("", reverseLetters);
            reversedwords.add(reverseWord);
        }
        return String.join(" ", reversedwords);
    }
}
