// 661. Image Smoother - Easy

// Initial thoughts: 
// This problem is annoying because we cannot change the array in place, as 
// that will affect the calculations of all the subsequent array indices. 
// Furthermore, hardcoding the corner cases might not be optimal either since 
// the length and width of the array could vary from 1 to 150. However, it is 
// possible to find cases for the 8 different spots to check. The top row will 
// not be checking above, and the bottom row will not be checking below. The 
// leftmost column will similarly not be checking left, and the rightmost 
// column won't be checking right. In all other cases, all of the indices are 
// considered.

// Implementation:

class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] toReturn = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                int total = 0;
                int count = 0;
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        if (((i + x) >= 0) && ((j + y) >= 0) && ((i + x) < M.length) && ((j + y) < M[i].length)) {
                            total = total + M[i + x][j + y];
                            count = count + 1;
                        }
                    }
                }
                toReturn[i][j] = (int) Math.floor(total / count);
            }
        }
        return toReturn;
    }
}

// Afterthoughts:
// Checking top and checking left or right at the same time is tricky, since 
// the corner indexes overlap. Eventually I just gave up trying to optimize 
// the edge cases and just did a brute force check for every index regardless 
// of the current index's position. I used nested for loops to get each pair 
// and checked for validity before incrementing total and count. Another 
// concern is that Math.floor returns a double, but expects an int return. I 
// just used a typecast because the number should never get big enough for 
// there to be an overflow during casting.

// Results:
// Runtime: 17 ms, faster than 57.22% of Java online submissions for Image 
// Smoother.
// Memory Usage: 46.7 MB, less than 52.00% of Java online submissions for 
// Image Smoother.
