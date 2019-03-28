// 771. Jewels and Stones - Easy

// Initial thoughts: 
// It seems easy enough to do this with a HashMap to keep track of the jewel 
// strings. First, iterate through each character in J and put those 
// characters in a HashMap as the key. Then, iterate through each character in 
// S checking to see if the character is a key in the HashMap. If so, 
// increment a counter. Return the counter at the end.

// Implementation:

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            String cur = "" + J.charAt(i);
            map.put(cur, 0);
        }
        for (int i = 0; i < S.length(); i++) {
            String stone = "" + S.charAt(i);
            if (map.containsKey(stone)) {
                count = count + 1;
            }
        }
        return count;
    }
}

// Afterthoughts:
// Nothing much to say, got it right on the first try with an optimal 
// implementation. Had one minor syntax error where I tried to store the char 
// as a String, but this was quickly solved with Java's string concatenator 
// with an empty string. 

// Results:
// Runtime: 2 ms, faster than 98.68% of Java online submissions for Jewels and 
// Stones.
// Memory Usage: 37.1 MB, less than 87.95% of Java online submissions for 
// Jewels and Stones.
