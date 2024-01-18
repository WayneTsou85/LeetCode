package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberOfOccurrencesTest {

    private final UniqueNumberOfOccurrences solution = new UniqueNumberOfOccurrences();

    public static Stream<Arguments> uniqueOccurrences() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 2},
                        false
                ),
                Arguments.of(
                        new int[]{1,2,2,1,1,3},
                        true
                ),
                Arguments.of(
                        new int[]{-3,0,1,-3,1,1,1,-3,10,0},
                        true
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void uniqueOccurrences(int[] arr, boolean expected) {
        boolean actual = solution.uniqueOccurrences(arr);
        assertEquals(expected, actual);
    }

}
