package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseVowelsOfAStringTest {

    private final ReverseVowelsOfAString solution = new ReverseVowelsOfAString();

    @ParameterizedTest
    @CsvSource(textBlock = """
            hello, holle
            leetcode, leotcede
            aA, Aa
            """)
    void reverseVowels(String input, String expectedResult) {
        String actualResult = solution.reverseVowels(input);
        assertEquals(expectedResult, actualResult);
    }
}
