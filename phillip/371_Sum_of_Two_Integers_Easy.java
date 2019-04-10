// Implementation:

class Solution {
    public int getSum(int a, int b) {
        int sum = a ^ b;
        int carry = (a & b) * 2;
        while (carry != 0) {
            int swap = (sum & carry) * 2;
            sum = sum ^ carry;
            carry = swap;
        }
        return sum;
    }
}

// Results:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Two Integers.
// Memory Usage: 31.5 MB, less than 100.00% of Java online submissions for Sum of Two Integers.