package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringsAlternatelyTest {

    private final MergeStringsAlternately SOLUTION = new MergeStringsAlternately();


    @ParameterizedTest
    @CsvSource(textBlock = """
            abc, pqr, apbqcr
            ab, pqrs, apbqrs
            abcd, pq, apbqcd
            """)
    void mergeAlternately(String word1, String word2, String expectedResult) {
        String actualResult = SOLUTION.mergeAlternately(word1, word2);
        assertEquals(expectedResult, actualResult);
    }
}
