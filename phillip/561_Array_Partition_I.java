// Implementation:
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = nums.length - 2; i >= 0; i = i - 2) {
            sum = sum + nums[i];
        }
        return sum;
    }
}

// Results:
// Runtime: 14 ms, faster than 92.59% of Java online submissions for Array Partition I.
// Memory Usage: 42.4 MB, less than 30.89% of Java online submissions for Array Partition I.