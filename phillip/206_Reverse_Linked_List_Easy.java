/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<Integer> stk = new Stack<Integer>();
        while (head != null) {
            stk.push(head.val);
            head = head.next;
        }
        ListNode toReturn = new ListNode(stk.pop());
        ListNode cur = toReturn;
        while (!stk.empty()) {
            cur.next = new ListNode(stk.pop());
            cur = cur.next;
        }
        return toReturn;
    }
}

// Results:
// Runtime: 2 ms, faster than 5.54% of Java online submissions for Reverse Linked List.
// Memory Usage: 38.1 MB, less than 5.08% of Java online submissions for Reverse Linked List.
