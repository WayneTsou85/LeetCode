/**
 * date       : 2022/7/19 上午 09:14
 * description:
 */
package easy;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode pointer = head;
        while (pointer != null) {
            nodes.add(pointer);
            pointer = pointer.next;
        }
        return nodes.get(nodes.size()/2);
    }
}
