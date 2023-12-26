package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PivotIndexTest {
    PivotIndex solution = new PivotIndex();

    @Test
    void givenSample1_whenPivotIndex_thenAssertExpect() {
        // given
        int[] given = new int[]{1,7,3,6,5,6};
        // when
        int result = solution.pivotIndex(given);
        // then
        assertEquals(3, result);
    }

    @Test
    void givenSample2_whenPivotIndex_thenAssertExpect() {
        // given
        int[] given = new int[]{1,2,3};
        // when
        int result = solution.pivotIndex(given);
        // then
        assertEquals(-1, result);
    }

    @Test
    void givenSample3_whenPivotIndex_thenAssertExpect() {
        // given
        int[] given = new int[]{2,1,-1};
        // when
        int result = solution.pivotIndex(given);
        // then
        assertEquals(0, result);
    }
}
