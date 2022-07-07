/**
 * date       : 2022/7/4 下午 03:30
 * description:
 */
package utils;

import easy.ListNode;

public class ListNodeUtil {

    public static ListNode createSampleNode(int... vals) {
        ListNode rootNode = null;
        ListNode currentNode = null;
        for (int val : vals) {
            if (rootNode == null) {
                rootNode = new ListNode(val);
            } else {
                if (currentNode == null)  {
                    currentNode = new ListNode(val);
                    rootNode.next = currentNode;
                } else {
                    currentNode.next = new ListNode(val);
                    currentNode = currentNode.next;
                }

            }
        }
        return rootNode;
    }
}
