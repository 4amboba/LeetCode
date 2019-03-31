// 804. Unique Morse Code Words - Easy

// Initial thoughts: 
// Doable with a Hashtable to keep track of the unique morse codes generated. 
// The given array for morse code letters can be initialized as an array and 
// the alphabet characters can be converted to ints via their ASCII encodings 
// to match the array indices. Then, the HashTable can be referenced to find 
// the number of unique keys to return.

// Implementation:

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (int i = 0; i < words.length; i++) {
            String morse = "";
            for (int j = 0; j < words[i].length(); j++) {
                morse = morse + arr[((int) words[i].charAt(j) - 97)];
            }
            map.put(morse, 0);
        }
        return map.keySet().size();
    }
}

// Afterthoughts:
// Program worked exactly as planned on first run. No other ideas on how to 
// improve efficiency. Maybe another simpler version of a hashmap with only 
// the key parts?

// Results:
// Runtime: 2 ms, faster than 98.83% of Java online submissions for Unique 
// Morse Code Words.
// Memory Usage: 36.9 MB, less than 83.04% of Java online submissions for 
// Unique Morse Code Words.