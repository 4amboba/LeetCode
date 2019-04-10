// Implementation:
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if ((l1 == null) && (l2 == null)) {
            return null;
        }
        else if ((l1 == null) && (l2 != null)) {
            return l2;
        }
        else if ((l1 != null) && (l2 == null)) {
            return l1;
        }
        else {
            if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }
}

// Results:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
// Memory Usage: 36.9 MB, less than 97.95% of Java online submissions for Merge Two Sorted Lists.