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

        // When & Then
        assertThat(anagram.generate("a"), is(Arrays.asList("a")));
    }

    @Test
    public void the_anagram_of_a_two_letter_word_should_be_two_words() {
        // Given
        Anagram anagram = new Anagram();

        // When & Then
        assertThat(anagram.generate("ab"), is(Arrays.asList("ab", "ba")));
    }

    @Test
    public void the_anagram_of_a_three_letter_word_should_be_six_words() {
        // Given
        Anagram anagram = new Anagram();

        // When & Then
        assertThat(anagram.generate("abc"), is(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
    }
}
