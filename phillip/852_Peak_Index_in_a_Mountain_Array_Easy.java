// 852. Peak Index in a Mountain Array

// Implementation:
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int toReturn = 0;
        int max = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
                toReturn = i;
                
            }
        }
        return toReturn;
    }
}

// Results:
// 0 ms
// 1 MB