// Implementation:

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        Iterator<Integer> iter = set.iterator();
        return iter.next();
    }
}

// Runtime: 7 ms, faster than 33.51% of Java online submissions for Single Number.
// Memory Usage: 41.1 MB, less than 30.72% of Java online submissions for Single Number.