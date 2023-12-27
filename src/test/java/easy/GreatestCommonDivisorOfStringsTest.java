package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatestCommonDivisorOfStringsTest {

    private final GreatestCommonDivisorOfStrings SOLUTION = new GreatestCommonDivisorOfStrings();


    @ParameterizedTest
    @CsvSource(textBlock = """
            ABCABC, ABC, ABC
            ABABAB, ABAB, AB
            LEET, CODE,''
            """)
    void gcdOfStrings(String str1, String str2, String expectedResult) {
        String actualResult = SOLUTION.gcdOfStrings(str1, str2);
        assertEquals(expectedResult, actualResult);
    }
}
