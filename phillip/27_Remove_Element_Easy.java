// Implementation:
class Solution {
    public int removeElement(int[] nums, int val) {
        int loc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[loc] = nums[i];
                loc++;
            }
        }
        return loc;
    }
}
// Results:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
// Memory Usage: 37.3 MB, less than 96.22% of Java online submissions for Remove Element.