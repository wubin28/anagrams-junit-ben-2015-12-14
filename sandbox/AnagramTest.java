import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.List;
import java.util.Arrays;

public class AnagramTest {

    @Test
    public void the_anagram_of_a_one_letter_word_should_be_itself() {
        // Given
        Anagram anagram = new Anagram();

        // When
        List<String> result = anagram.generate("a");

        // Then
        assertThat(result, is(Arrays.asList("a")));
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
        assertEquals(2, result.size());
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
        assertEquals(6, result.size());
    }
}
