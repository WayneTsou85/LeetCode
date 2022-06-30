package easy; /**
 * date       : 2022/6/30 上午 10:50
 * description:
 */

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, MergeTwoSortedLists.ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "easy.ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MergeTwoSortedLists.ListNode listNode = (MergeTwoSortedLists.ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
