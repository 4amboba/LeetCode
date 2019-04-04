// 944. Delete Columns to Make Sorted - Easy

// Implementation:

class Solution {
    public int minDeletionSize(String[] A) {
        int toReturn = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 1; j < A.length; j++) {
                if (A[j].charAt(i) < A[j - 1].charAt(i)) {
                    toReturn++;
                    break;
                }
            }
        }
        return toReturn;
    }
}

// Results:
// Runtime: 7 ms, faster than 96.52% of Java online submissions for Delete 
// Columns to Make Sorted.
// Memory Usage: 39.6 MB, less than 83.13% of Java online submissions for 
// Delete Columns to Make Sorted.

