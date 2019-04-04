// 728. Self Dividing Numbers - Easy


// Implementation:
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> toReturn = new LinkedList<Integer>();
        for (int i = left; i <= right; i++) {
            int cur = i;
            while (cur != 0) {
                if ((cur % 10) == 0) {
                    break;
                } 
                else if ((i % (cur % 10)) != 0) {
                    break;
                } else {
                    cur = cur / 10;
                }
            }
            if (cur == 0) {
                toReturn.add(i);
            }
        }
        return toReturn;
    }
}

// Results:
// Runtime: 2 ms, faster than 96.72% of Java online submissions for Self Dividing Numbers.
// Memory Usage: 32.6 MB, less than 100.00% of Java online submissions for Self Dividing Numbers.