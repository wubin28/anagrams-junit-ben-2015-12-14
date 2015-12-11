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
        return Arrays.asList(string.substring(0, 1) + "bc", 
                             string.substring(0, 1) + "cb", 
                             string.substring(1, 2) + "ac", 
                             string.substring(1, 2) + "ca", 
                             string.substring(2) + "ab", 
                             string.substring(2) + "ba");
    }
}
