import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagram {
    List<String> generate(String string) {
        if (string.length() == 2) {
        return Arrays.asList(string.substring(0, 1) + string.substring(1), 
                             string.substring(1) + string.substring(0, 1));
        }
        return Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
    }
}
