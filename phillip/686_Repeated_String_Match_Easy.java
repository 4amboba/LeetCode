// Implementation:
class Solution {
    public int repeatedStringMatch(String A, String B) {
        int count = 0;
        int firstint = -1;
        if (A.length() > B.length()) {
            if (A.contains(B)) {
                return 1;
            } 
            else if ((A + A).contains(B)) {
                return 2;
            }
            else {
                return -1;
            }
        }
        for (int i = 0 ; i < B.length(); i++) {
            if (B.charAt(i) == A.charAt(0)) {
                if ((i + A.length() <= B.length()) && (B.substring(i, i + A.length()).equals(A))) {
                    if (firstint == -1) {
                        firstint = i;
                    }
                    i = i + A.length() - 1;
                    count++;
                    continue;
                }
                else if ((i + A.length() > B.length()) && (B.substring(i, B.length()).equals(A.substring(0, B.length() - i)))) {
                    if (firstint == -1) {
                        firstint = i;
                    }
                    count++;
                    break;
                }
                if ((firstint != -1) || (firstint == 0)) {
                    return -1;
                }
            }
            else if ((firstint != -1)) {
                return -1;
            }
        }
        //System.out.println(count);
        //System.out.println(firstint);
        if (firstint == -1) {
            return -1;
        }
        if ((firstint < A.length()) && (B.substring(0, firstint).equals(A.substring(A.length() - firstint, A.length())))) {
            if (firstint != 0) {
                count++;
            }
        } else {
            return -1;
        }
        return count;
    }
}

// Results:
// Runtime: 3 ms, faster than 98.47% of Java online submissions for Repeated String Match.
// Memory Usage: 37.4 MB, less than 35.80% of Java online submissions for Repeated String Match.
