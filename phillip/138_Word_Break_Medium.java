// Implementation:
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<String>();
        for (int i = 0; i < wordDict.size(); i++) {
            dict.add(wordDict.get(i));
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 0);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                if (dict.contains(s.substring(i, j))) {
                    if (map.containsKey(i)) {
                        map.put(j, 420);
                    }
                    if ((j == (s.length())) && map.containsKey(i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

//Results:
// Runtime: 7 ms, faster than 43.76% of Java online submissions for Word Break.
// Memory Usage: 37.2 MB, less than 63.24% of Java online submissions for Word Break.