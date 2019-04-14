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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pdepth = 0;
        int qdepth = 0;
        TreeNode curp = root;
        TreeNode curq = root;
        TreeNode toReturn = root;
        while ((curp != p) && (curq != q)) {
            if (p.val < curp.val) {
                curp = curp.left;
            } 
            else if (p.val > curp.val) {
                curp = curp.right;
            }
            if (q.val < curq.val) {
                curq = curq.left;
            }
            else if (q.val > curq.val) {
                curq = curq.right;
            }
            if (curq == curp) {
                toReturn = curp;
            } else {
                return toReturn;
            }
        }
        return toReturn;
    }
}

// Results:
// Runtime: 4 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
// Memory Usage: 35.4 MB, less than 13.25% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
