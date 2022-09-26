package easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    IsSubsequence solution = new IsSubsequence();

    @ParameterizedTest
    @CsvSource(value = {
            "abc, ahbgdc",
            "'', ahbgdc",
            "b, abc"
    })
    void testIsSubsequence_shouldTrue(String s, String t) {
        // when
        boolean result = solution.isSubsequence(s, t);
        // then
        assertTrue(result);
    }

    @DisplayName("Test is subsequence")
    @ParameterizedTest(name = "({0}, {1}) = {2}")
    @CsvSource(delimiter ='|', textBlock = """
            axc | ahbgdc | false
            acs |  '' | false
            """
    )
    void testIsSubsequence_shouldFalse(String s, String t, boolean expected) {
        // when
        boolean result = solution.isSubsequence(s, t);
        // then
        assertEquals(expected, result);
    }
}