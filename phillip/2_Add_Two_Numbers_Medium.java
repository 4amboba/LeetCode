// 2. Add Two Numbers - Medium

// Initial thoughts: 
// Keep adding each from the head and use a carry flag to tell if there's a carry to the next digit. Need to remember to use "new" when declaring the ListNode class.

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add1 = l1.val;
        int add2 = l2.val;
        int sum = ((add1 + add2) % 10);
        int carry = 0;
        if ((add1 + add2) >= 10) {
            carry = 1;
        }
        ListNode head = new ListNode(sum);
        ListNode cur = head;
        ListNode cur1 = l1.next;
        ListNode cur2 = l2.next;
        while ((cur1 != null) || (cur2 != null) || (carry == 1)) {
            if (cur1 == null) {
                add1 = 0;
            } else {
                add1 = cur1.val;
            }
            if (cur2 == null) {
                add2 = 0;
            } else {
                add2 = cur2.val;
            }
            sum = add1 + add2 + carry;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
                sum = sum % 10;
            }
            cur.next = new ListNode(sum);
            cur = cur.next;
            if (cur1 != null) {
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                cur2 = cur2.next;
            }
        }
        return head; 
    }
}

// Afterthoughts:
// Not as bad as I expected. The only problem I had was remembering to include carry == 1 as a condition for the while loop as well, for the case where you have 5 + 5 = 10. 

// Results:
// Runtime: 2 ms, faster than 98.98% of Java online submissions for Add Two 
// Numbers.
// Memory Usage: 46.4 MB, less than 52.42% of Java online submissions for Add 
// Two Numbers.
