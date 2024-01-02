package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithTheGreatestNumberOfCandiesTest {

    private static final KidsWithTheGreatestNumberOfCandies SOLUTION = new KidsWithTheGreatestNumberOfCandies();

    @ParameterizedTest
    @MethodSource
    void kidsWithCandies(int[] candies, int extraCandies, List<Boolean> expectedResult) {
        List<Boolean> actualResult = SOLUTION.kidsWithCandies(candies, extraCandies);
        assertEquals(expectedResult, actualResult);
    }


    public static Stream<Arguments> kidsWithCandies() {
        return Stream.of(
                Arguments.of(
                        new int[]{2, 3, 5, 1, 3},
                        3,
                        List.of(true, true, true, false, true)),
                Arguments.of(
                        new int[]{4, 2, 1, 1, 2},
                        1,
                        List.of(true, false, false, false, false)
                ),
                Arguments.of(
                        new int[]{12, 1, 12},
                        10,
                        List.of(true, false, true)
                )
        );
    }
}
