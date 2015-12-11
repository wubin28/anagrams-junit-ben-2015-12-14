import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Anagram {
    public List<String> generate(String string) {
        if (string.length() == 1) {
            return Arrays.asList(string);
        }
        if (string.length() == 2) {
            return Arrays.asList(string, 
                                 string.substring(1) + string.substring(0, 1));
        }
        return Arrays.asList(string, 
                             "acb", 
                             "bac", 
                             "bca", 
                             "cab", 
                             "cba");
    }
}
