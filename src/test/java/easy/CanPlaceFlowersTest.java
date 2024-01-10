package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    private final CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

    public static Stream<Arguments> canPlaceFlowers() {
        return Stream.of(
                Arguments.of(new int[]{1,0,0,0,1}, 1, true),
                Arguments.of(new int[]{0}, 1, true),
                Arguments.of(new int[]{1}, 0, true),
                Arguments.of(new int[]{0, 1}, 1, false),
                Arguments.of(new int[]{1,0,0,0,1}, 2, false),
                Arguments.of(new int[]{1,0,0,0,1,0,0}, 2, true)
        );
    }

    @ParameterizedTest
    @MethodSource
    void canPlaceFlowers(int[] flowerbed, int n, boolean expectedResult) {
        boolean actualResult = canPlaceFlowers.canPlaceFlowers(flowerbed, n);
        assertEquals(expectedResult, actualResult);
    }
}
