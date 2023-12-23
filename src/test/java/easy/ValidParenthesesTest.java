package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidParenthesesTest {

    private static final ValidParentheses SOLUTION = new ValidParentheses();

    @ParameterizedTest
    @CsvSource(textBlock = """
            (), true
            ()[]{}, true
            (, false
            (], false
            {[]}, true
            """)
    void isValid(String input, boolean expectedResult) {
        boolean actual = SOLUTION.isValid(input);
        assertEquals(expectedResult, actual);
    }
}
