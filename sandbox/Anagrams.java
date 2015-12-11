import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagrams {
    public static List<String> of(String string) {
        if (string.length() == 1) {
            return Arrays.asList(string);
        }
        if (string.length() == 2) {
            return Arrays.asList(string, 
                                 string.substring(1) + string.substring(0, 1));
        }
        return Arrays.asList(string.substring(0, 1) + Anagrams.of("bc").get(0), 
                             string.substring(0, 1) + Anagrams.of("bc").get(1), 
                             string.substring(1, 2) + Anagrams.of("ac").get(0), 
                             string.substring(1, 2) + Anagrams.of("ac").get(1), 
                             string.substring(2) + Anagrams.of("ab").get(0), 
                             string.substring(2) + Anagrams.of("ab").get(1));
    }
}
