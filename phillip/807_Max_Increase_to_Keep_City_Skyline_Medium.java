// Implementation: 
class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] horizontal = new int[grid.length];
        int[] vertical = new int[grid.length];
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > horizontal[i]) {
                    horizontal[i] = grid[i][j];
                }
                if (grid[i][j] > vertical[j]) {
                    vertical[j] = grid[i][j];
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (horizontal[i] < vertical[j]) {
                    sum = sum + (horizontal[i] - grid[i][j]);
                } else {
                    sum = sum + (vertical[j] - grid[i][j]);
                }
            }
        }
        return sum;
    }
}

//Results:
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Max Increase to Keep City Skyline.
// Memory Usage: 44.4 MB, less than 6.20% of Java online submissions for Max Increase to Keep City Skyline.
