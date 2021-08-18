import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KataReverseWords {

    public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        List<String> reverencedWords = Arrays.asList(words).stream().map( word -> new StringBuilder(word).reverse().toString() ).collect(Collectors.toList());
        return String.join(" ", reverencedWords);
    }

}
