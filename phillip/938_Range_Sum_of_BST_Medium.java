//Implementation:

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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        else if ((root.val >= L) && (root.val <= R)) {
            return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R) + root.val;
        } 
        else if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        } 
        else if (root.val > R) {
            return rangeSumBST(root.left, L, R);
        }
        else {
            return 0;
        }
    }
}

// Results:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
// Memory Usage: 49.1 MB, less than 5.13% of Java online submissions for Range Sum of BST.
