// Implementation:
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        long cur = n & 0x00000000ffffffffL;
        while (cur != 0) {
            if ((cur & 1) == 1) {
                count++;
            }
            cur = cur/2;
        }
        return count;
    }
}

// Results:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.
// Memory Usage: 32.1 MB, less than 100.00% of Java online submissions for Number of 1 Bits.
