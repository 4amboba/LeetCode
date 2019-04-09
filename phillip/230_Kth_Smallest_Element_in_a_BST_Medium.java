// Implementation:
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
    public int kthSmallest(TreeNode root, int k) {
        TreeNode cur = root;
        Stack<TreeNode> stk = new Stack<TreeNode>();
        while (cur.left != null) {
            stk.push(cur);
            cur = cur.left;
        }
        for (int i = 1; i < k; i++) {
            if (cur.right != null) {
                cur = cur.right;
                while (cur.left != null) {
                    stk.push(cur);
                    cur = cur.left;
                }
            } 
            else {
                cur = stk.pop();
            }
        }
        return cur.val;
    }
}

// Results:
// Runtime: 1 ms, faster than 41.69% of Java online submissions for Kth Smallest Element in a BST.
// Memory Usage: 38.7 MB, less than 45.19% of Java online submissions for Kth Smallest Element in a BST.
