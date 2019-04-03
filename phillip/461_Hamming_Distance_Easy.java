// 461. Hamming Distance - Easy

// Initial thoughts: 
// Something about using a XOR sounds good.

// Implementation:

class Solution {
    public int hammingDistance(int x, int y) {
        int num = x ^ y;
        int cnt = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                cnt = cnt + 1;
            }
            num = num / 2;
        }
        return cnt;
    }
}

// Afterthoughts:
// Using BITWISE AND with 1 can let you check the first position, then you 
// keep dividing by 2 until the number is 0 to increment count. 

// Results:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming 
// Distance.
// Memory Usage: 32.1 MB, less than 100.00% of Java online submissions for 
// Hamming Distance.
