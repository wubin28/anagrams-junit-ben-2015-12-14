import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import java.util.List;
import java.util.Arrays;

public class AnagramTest {

    @Test
    public void the_anagrams_of_a_one_letter_word_should_be_itself() {
        assertThat(Anagrams.of("a"), is(Arrays.asList("a")));
    }

    @Test
    public void the_anagrams_of_a_two_letter_word_should_be_two_words() {
        assertThat(Anagrams.of("ab"), is(Arrays.asList("ab", "ba")));
    }

    @Test
    public void the_anagrams_of_a_three_letter_word_should_be_six_words() {
        assertThat(Anagrams.of("abc"), is(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
    }

    @Test
    public void the_anagrams_of_a_four_letter_word_should_be_twenty_four_words() {
        assertThat(Anagrams.of("abcd").size(), is(24)));
    }
}
