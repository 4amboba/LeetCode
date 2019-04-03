// 905. Sort Array By Parity - Easy

// Initial thoughts: 
// Initialize an array same size as input array. Iterate through array and put 
// even numbers at the front and odd at the back. Keep values to represent the 
// tail of the even partition and the head of the odd partition. 

// Implementation:

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        int eventail = 0;
        int oddhead = A.length - 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                arr[eventail] = A[i];
                eventail = eventail + 1;
            } else {
                arr[oddhead] = A[i];
                oddhead = oddhead - 1;
            }
        }
        return arr;
    }
}

// Afterthoughts:
// None. Worked first try with optimal runtime.

// Results:
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort 
// Array By Parity.
// Memory Usage: 42.1 MB, less than 26.44% of Java online submissions for Sort 
// Array By Parity.
