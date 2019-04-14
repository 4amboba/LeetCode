class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int max2 = 0;
        if (height[0] < height[1]) {
            max2 = 0;
            max = 1;
        } else {
            max2 = 1;
            max = 0;
        }
        int curmax = water(max, max2, height);
        for (int i = 2; i < height.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (water(i, j, height) > curmax) {
                    curmax = water(i, j, height);
                    max = j;
                    max2 = i;
                }
            }
        }
        return curmax;
    }
    
    public int min (int a, int b, int[] height) {
        if (height[a] < height[b]) {
            return height[a];
        } else {
            return height[b];
        }
    }
    public int water(int a, int b, int[] height) {
        return (min(a, b, height) * Math.abs(b - a));
    }
}

// Results:
// Runtime: 270 ms, faster than 7.83% of Java online submissions for Container With Most Water.
// Memory Usage: 41.1 MB, less than 5.05% of Java online submissions for Container With Most Water.
