// 657. Robot Return To Origin - Easy

// Initial thoughts: 
// Iterate through the String with a coordinate pair. If coordinates are 0,0 
// after, return true

// Implementation:

class Solution {
    public boolean judgeCircle(String moves) {
        if ((moves.length() % 2) != 0) {
            return false;
        }
        int vert = 0;
        int hori = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch(moves.charAt(i)) {
                case 'U':
                    vert++;
                    break;
                case 'D':
                    vert--;
                    break;
                case 'R':
                    hori++;
                    break;
                case 'L':
                    hori--;
                    break;
            }
        }
        if ((vert == 0) && (hori == 0)) {
            return true;
        }
        return false;
    }
}

// Afterthoughts:
// One extra case is that all odd length strings are instantly false, since 
// there has to be 1 U for every D and 1 L for every R. 

// Results:
// Runtime: 7 ms, faster than 89.69% of Java online submissions for Robot 
// Return to Origin.
// Memory Usage: 38.1 MB, less than 91.39% of Java online submissions for 
// Robot Return to Origin.