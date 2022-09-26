package easy;

import common.ListNode;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.ListNodeUtil.createSampleNode;

class MiddleOfTheLinkedListTest {
    MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

    @Order(1)
    @Test
    public void givenSample1_whenFindMiddleNode_thenAssertExpect() {
        // given
        ListNode node = createSampleNode(1,2,3,4,5);
        // when
        ListNode result = solution.middleNode(node);
        // then
        assertEquals(createSampleNode(3, 4, 5), result);
    }

    @Order(2)
    @Test
    public void givenSample2_whenFindMiddleNode_thenAssertExpect() {
        // given
        ListNode node = createSampleNode(1,2,3,4,5,6);
        // when
        ListNode result = solution.middleNode(node);
        // then
        assertEquals(createSampleNode(4,5,6), result);
    }


}