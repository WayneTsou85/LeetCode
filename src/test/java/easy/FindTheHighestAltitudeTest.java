package easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindTheHighestAltitudeTest {

    private final FindTheHighestAltitude solution = new FindTheHighestAltitude();

    public static Stream<Arguments> largestAltitude() {
        return Stream.of(
                Arguments.of(
                        new int[]{-5,1,5,0,-7},
                        1
                ),
                Arguments.of(
                        new int[]{-4,-3,-2,-1,4,3,2},
                        0
                )
        );
    }

    @ParameterizedTest
    @MethodSource
    void largestAltitude(int[] gain, int expectedResult) {
        int actualResult = solution.largestAltitude(gain);
        assertEquals(expectedResult, actualResult);
    }
}
