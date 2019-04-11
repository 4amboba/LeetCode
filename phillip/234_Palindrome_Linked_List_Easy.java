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
    public boolean isPalindrome(ListNode head) {
        long tim = System.currentTimeMillis();
        int len = 0;
        if ((head == null) || (head.next == null)) {
            return true;
        }
        ListNode cur = head;;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        System.out.println(System.currentTimeMillis() - tim);
        int i = 0;
        while (i < len/2) {
            cur = head;
            for (int j = i; j < (len - i - 1); j++) {
                cur = cur.next;
            }
            if (head.val != cur.val) {
                return false;
            }
            head = head.next;
            i++;
        }
        return true;
    }
}

// Results:
// Runtime: 1075 ms, faster than 5.02% of Java online submissions for Palindrome Linked List.
// Memory Usage: 41.5 MB, less than 94.88% of Java online submissions for Palindrome Linked List.