// Implementation:

class Solution {
    public List<String> commonChars(String[] A) {
        int[][] arr = new int[A.length][26];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0;  j < A[i].length(); j++) {
                arr[i][(int)A[i].charAt(j) - 97]++;
            }
        }
        List<String> list = new LinkedList<String>();
        for (int i = 0; i < 26; i++) {
            if (arr[0][i] > 0) {
                int min = arr[0][i];
                for (int j = 1; j < A.length; j++) {
                    if (arr[j][i] == 0) {
                        min = 0;
                        break;
                    }
                    if (arr[j][i] < min) {
                        min = arr[j][i];
                    }
                }
                for (int k = 0; k < min; k++) {
                    list.add(((char)(i + 97)) + "");
                }
            }
        }
        return list;
    }
}

// Runtime:
// Runtime: 6 ms, faster than 82.03% of Java online submissions for Find Common Characters.
// Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Find Common Characters.