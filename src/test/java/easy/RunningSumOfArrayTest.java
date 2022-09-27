package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumOfArrayTest {

    RunningSumOfArray solution = new RunningSumOfArray();

    @Test
    public void givenSample1_whenRunningSum_thenAssertExpect() {
        // given
        int[] nums = new int[]{1,2,3,4};
        // when
        int[] result = solution.runningSum(nums);

        // then
        assertArrayEquals(new int[]{1,3,6,10}, result);
    }

    @Test
    public void givenSample2_whenRunningSum_thenAssertExpect() {
        // given
        int[] nums = new int[]{1,1,1,1,1};
        // when
        int[] result = solution.runningSum(nums);

        // then
        assertArrayEquals(new int[]{1,2,3,4,5}, result);
    }

    @Test
    public void givenSample3_whenRunningSum_thenAssertExpect() {
        // given
        int[] nums = new int[]{3,1,2,10,1};
        // when
        int[] result = solution.runningSum(nums);

        // then
        assertArrayEquals(new int[]{3,4,6,16,17}, result);
    }
}