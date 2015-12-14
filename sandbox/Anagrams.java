import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagrams {
    public static List<String> of(String s) {
        if (s.length() == 1) {
            return Arrays.asList(s);
        }

        List<String> anagrams = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            List<String> anagramsOfRest = Anagrams.of(dropCharacter(s, i));
            for (String anagramOfRest : anagramsOfRest) {
                anagrams.add(s.substring(i, i + 1) + anagramOfRest);
            }
        }

        return anagrams;
    }

    private static String dropCharacter(String s, int index) {
        String before = s.substring(0, index);
        String after = s.substring(index + 1, s.length());
        return before + after;
    }
}
