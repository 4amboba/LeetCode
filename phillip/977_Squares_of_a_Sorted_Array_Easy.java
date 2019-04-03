// 977. Squares of a Sorted Array - Easy

// Initial thoughts: 
// Iterate through the array squaring everything. Then, sort.

// Implementation:

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] arr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            arr[i] = A[i] * A[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}

// Afterthoughts:
// One thing I wasn't used to was that Arrays.sort() has no return value. It 
// just sorts the array in place. Other than that, no complications arose.

// Results:
// Runtime: 2 ms, faster than 98.09% of Java online submissions for Squares of 
// a Sorted Array.
// Memory Usage: 42.7 MB, less than 53.75% of Java online submissions for 
// Squares of a Sorted Array.