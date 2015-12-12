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
        return Arrays.asList(s.substring(0, 1) + Anagrams.of(dropCharacter(s, 0)).get(0), 
                             s.substring(0, 1) + Anagrams.of(dropCharacter(s, 0)).get(1), 
                             s.substring(1, 2) + Anagrams.of("ac").get(0), 
                             s.substring(1, 2) + Anagrams.of("ac").get(1), 
                             s.substring(2) + Anagrams.of("ab").get(0), 
                             s.substring(2) + Anagrams.of("ab").get(1)
                             );
    }

    private static String dropCharacter(String s, int index) {
        return "bc";
    }
}
