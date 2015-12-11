import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;

public class AnagramTest {

    @Test
    public void the_anagram_of_a_one_letter_word_should_be_itself() {
        // Given
        Anagram anagram = new Anagram();

        // When & Then
        assertTrue(anagram.generate("a").contains("a"));
    }

    @Test
    public void the_anagram_of_a_two_letter_word_should_be_two_words() {
        // Given
        Anagram anagram = new Anagram();

        // When
        List<String> result = anagram.generate("ab");

        //Then
        assertTrue(result.contains("ab"));
        assertTrue(result.contains("ba"));
    }

    @Test
    public void the_anagram_of_a_three_letter_word_should_be_six_words() {
        // Given
        Anagram anagram = new Anagram();

        // When
        List<String> result = anagram.generate("abc");

        //Then
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("acb"));
        assertTrue(result.contains("bac"));
        assertTrue(result.contains("bca"));
        assertTrue(result.contains("cab"));
        assertTrue(result.contains("cba"));
    }
}
