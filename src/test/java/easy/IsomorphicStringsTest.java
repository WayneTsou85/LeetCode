package easy;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class IsomorphicStringsTest {

    IsomorphicStrings solution = new IsomorphicStrings();

    @Order(1)
    @Test
    public void givenSample1_whenIsIsomorphic_thenAssertExpect() {
        // given
        String s = "egg";
        String t = "add";
        // when
        boolean result = solution.isIsomorphic(s, t);
        // then
        assertTrue(result);
    }

    @Order(2)
    @Test
    public void givenSample2_whenIsIsomorphic_thenAssertExpect() {
        // given
        String s = "foo";
        String t = "bar";
        // when
        boolean result = solution.isIsomorphic(s, t);
        // then
        assertFalse(result);
    }

    @Order(3)
    @Test
    public void givenSample3_whenIsIsomorphic_thenAssertExpect() {
        // given
        String s = "paper";
        String t = "title";
        // when
        boolean result = solution.isIsomorphic(s, t);
        // then
        assertTrue(result);
    }

    @Order(4)
    @Test
    public void givenCase4_whenIsIsomorphic_thenAssertExpect() {
        // given
        String s = "badc";
        String t = "baba";
        // when
        boolean result = solution.isIsomorphic(s, t);
        // then
        assertFalse(result);
    }

}