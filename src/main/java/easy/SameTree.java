package easy;

import common.TreeNode;

/**
 * date       : 2022/10/16 上午 01:10
 * description:
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }
        return false;
    }
}
