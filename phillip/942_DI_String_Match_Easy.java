// 942. DI String Match - Easy

// Initial thoughts: 
// Iterate through while keeping track of highs and lows

// Implementation:

class Solution {
    public int[] diStringMatch(String S) {
        int[] arr = new int[S.length() + 1];
        int left = 0;
        int right = S.length();
        if (S.charAt(0) == 'I') {
            arr[0] = left++;
        } else {
            arr[0] = right--;
        }
        for (int i = 1; i < arr.length; i++) {
            if (i == S.length()) {
                arr[i] = left;
                break;
            }
            if (S.charAt(i) == 'I') {
                arr[i] = left++;
            } else {
                arr[i] = right--;
            }
        }
        return arr;
    }
}

// Afterthoughts:

// Results:
// Runtime: 2 ms, faster than 99.62% of Java online submissions for DI String 
// Match.
// Memory Usage: 38.4 MB, less than 91.42% of Java online submissions for DI 
// String Match.
