// 832. Flipping an Image - Easy

// Initial thoughts: 
// Initialize another 2D Array that is the same size of input, and put the 
// inverse of the value in the horizontally flipped index. Runtime of O(n^2) 
// on input of a n x n array.

// Implementation:

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] arr = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                int newj = ((- (j + 1)) % A.length);
                if (newj < 0) {
                    newj = newj + A.length;
                }
                if (A[i][j] == 0) {
                    arr[i][newj] = 1;
                } else {
                    arr[i][newj] = 0;
                }
            }
        }
        return arr;
    }
}

// Afterthoughts:
// Idea worked solidly with optimal runtime. Only problem I ran into was that 
// I forgot that n % m could end up in a negative number. I fixed this by 
// incrementing the result by m if the result was negative. 

// Results:
// Runtime: 1 ms, faster than 94.68% of Java online submissions for Flipping 
// an Image.
// Memory Usage: 43 MB, less than 8.40% of Java online submissions for 
// Flipping an Image.
