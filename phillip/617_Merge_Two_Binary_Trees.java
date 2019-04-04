// 617. Merge Two Binary Trees - Easy

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode head;
        int sum = 0;
        if ((t1 == null) && (t2 == null)) {
            return null;
        }
        else if ((t1 == null) && (t2 != null)) {
            head = new TreeNode(t2.val);
            head.left = mergeTrees(null, t2.left);
            head.right = mergeTrees(null, t2.right);
        } 
        else if ((t1 != null) && (t2 == null)){
            head = new TreeNode(t1.val);
            head.left = mergeTrees(t1.left, null);
            head.right = mergeTrees(t1.right, null);
        }
        else {
            head = new TreeNode(t1.val + t2.val);
            head.left = mergeTrees(t1.left, t2.left);
            head.right = mergeTrees(t1.right, t2.right);
        }
        return head;
    }
}

// Results:
// Runtime: 1 ms, faster than 92.39% of Java online submissions for Merge Two 
// Binary Trees.
// Memory Usage: 41.2 MB, less than 78.00% of Java online submissions for 
// Merge Two Binary Trees.
