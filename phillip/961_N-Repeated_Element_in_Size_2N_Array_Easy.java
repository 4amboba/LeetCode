// 961. N-Repeated Element in Size 2N Array - Easy

// Initial thoughts: 
// Use a Hashmap to store the appeared keys and the number of appearances. 
// Return when number of appearances is equal to n.

// Implementation:

class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (!set.contains(A[i])) {
                set.add(A[i]);
            } else {
                return A[i];
            }
        }
        return 0;
    }
}

// Afterthoughts:
// On second thought after implementing my approach outlined in initial 
// thoughts, it is unnecessary to keep track of the count. Since the array 
// size is 2N and there are N + 1 Distinct elements, if a single element is 
// repeated once then that means that is the number. So I used a HashSet to 
// keep track of the inputs and returned as soon as a duplicate was found.

// Results:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for 
// N-Repeated Element in Size 2N Array.
// Memory Usage: 40.9 MB, less than 56.47% of Java online submissions for 
// N-Repeated Element in Size 2N Array.
