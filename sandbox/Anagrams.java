import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagrams {
    public static List<String> of(String s) {
        if (s.length() == 1) {
            return Arrays.asList(s);
        }
        if (s.length() == 2) {
            return Arrays.asList(s, 
                                 s.substring(1) + s.substring(0, 1));
        }
        List<String> anagrams = new ArrayList<String>();

        for (int i = 0; i < 2; i++) {
            anagrams.add(s.substring(i, 1) + Anagrams.of(dropCharacter(s, i)).get(0));
            anagrams.add(s.substring(i, 1) + Anagrams.of(dropCharacter(s, i)).get(1));
        }

        anagrams.add(s.substring(2) + Anagrams.of(dropCharacter(s, 2)).get(0));
        anagrams.add(s.substring(2) + Anagrams.of(dropCharacter(s, 2)).get(1));

        return anagrams;
    }

    private static String dropCharacter(String s, int index) {
        String before = s.substring(0, index);
        String after = s.substring(index + 1);
        return before + after;
    }
}
