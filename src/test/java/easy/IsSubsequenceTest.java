package easy;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class IsSubsequenceTest {

    IsSubsequence solution = new IsSubsequence();

    @Order(1)
    @Test
    public void givenSample1_whenIsSubsequence_thenAssertExpect() {
        // given
        String s = "abc";
        String t = "ahbgdc";
        // when
        boolean result = solution.isSubsequence(s, t);
        // then
        assertTrue(result);
    }

    @Order(2)
    @Test
    public void givenSample2_whenIsSubsequence_thenAssertExpect() {
        // given
        String s = "axc";
        String t = "ahbgdc";
        // when
        boolean result = solution.isSubsequence(s, t);
        // then
        assertFalse(result);
    }


    @Order(3)
    @Test
    public void givenSample3_whenIsSubsequence_thenAssertExpect() {
        // given
        String s = "";
        String t = "ahbgdc";
        // when
        boolean result = solution.isSubsequence(s, t);
        // then
        assertTrue(result);
    }

    @Order(4)
    @Test
    public void givenSample4_whenIsSubsequence_thenAssertExpect() {
        // given
        String s = "acs";
        String t = "";
        // when
        boolean result = solution.isSubsequence(s, t);
        // then
        assertFalse(result);
    }


    @Order(5)
    @Test
    public void givenSample5_whenIsSubsequence_thenAssertExpect() {
        // given
        String s = "b";
        String t = "abc";
        // when
        boolean result = solution.isSubsequence(s, t);
        // then
        assertTrue(result);
    }
}