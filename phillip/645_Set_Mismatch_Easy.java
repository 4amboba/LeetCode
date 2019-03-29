// 645. Set Mismatch - Easy

// Initial thoughts: 
// I can think of two approaches. One would be to sort the list, and then use 
// an O(n) iteration to find the missing number and the duplicated number. 
// This would be O(log n) runtime. Another approach would be to use a HashMap. 
// Iterate through the list, and as numbers appear, put them in the hashmap. 
// If the duplicate number appears, we would find it when the program attempts 
// to put it in the hashmap. While this for loop is running, keep track of the 
// maximum number. After that, iterate from 1 to that max number n, and test 
// each key to see if it is in the hashmap. When we find the key that ISN'T in 
// the hashmap, we have our missing number. This would be O(2n) runtime in the 
// worst case, which is better than the sorted approach.

// Implementation:

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] toReturn = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            } else {
                toReturn[0] = nums[i];
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                toReturn[1] = i;
                break;
            }
        }
        return toReturn;
    }
}

// Afterthoughts:
// One thing I hadn't considered is the fact that the max number could be the 
// missing number. In this case, there is still a simple fix. Since we know 
// for sure the numbers are distinct and range from 1 to n, we can just use 
// the size of the array to figure out the max number. All in all, it was 
// pretty straightforward to implement. Surprisingly though, the runtime was 
// not as fast as I had expected it to be when compared to the leaderboards. I 
// don't know what test cases they run it on, but I would expect O(2n) to be 
// faster than O(n log n). Perhaps the input sizes are just small enough where 
// O(n log n) would be faster.

// Results:
// Runtime: 17 ms, faster than 35.80% of Java online submissions for Set 
// Mismatch.
// Memory Usage: 41.3 MB, less than 43.28% of Java online submissions for Set 
// Mismatch.