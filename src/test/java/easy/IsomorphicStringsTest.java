package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsomorphicStringsTest {

    IsomorphicStrings solution = new IsomorphicStrings();

    @ParameterizedTest
    @CsvSource(value = {
            "egg, add",
            "paper, title"
    })
    void testIsIsomorphic_shouldTrue(String s, String t) {
        // when
        boolean result = solution.isIsomorphic(s, t);
        // then
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "foo, bar",
            "badc, baba"
    })
    void testIsIsomorphic_shouldFalse(String s, String t) {
        // when
        boolean result = solution.isIsomorphic(s, t);
        // then
        assertFalse(result);
    }
}