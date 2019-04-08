// Implementation:
class Solution {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    // Check down
                    int k = 1;
                    while ((i + k) < board.length) {
                        if (board[i+k][j] == 'B') {
                            break;
                        }
                        if (board[i+k][j] == 'p') {
                            count++;
                            break;
                        }
                        k++;
                    }
                    // Check up
                    k = 1;
                    while ((i - k) >= 0) {
                        if (board[i-k][j] == 'B') {
                            break;
                        }
                        if (board[i-k][j] == 'p') {
                            count++;
                            break;
                        }
                        k++;
                    }
                    // Check left
                    k = 1;
                    while ((j - k) >= 0) {
                        if (board[i][j-k] == 'B') {
                            break;
                        }
                        if (board[i][j-k] == 'p') {
                            count++;
                            break;
                        }
                        k++;
                    }
                    // Check right
                    k = 1;
                    while ((j + k) < board.length) {
                        if (board[i][j+k] == 'B') {
                            break;
                        }
                        if (board[i][j+k] == 'p') {
                            count++;
                            break;
                        }
                        k++;
                    }
                    return count;
                }
            }
        }
        return count;
    }
}

// Results:
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Available Captures for Rook.
// Memory Usage: 35.5 MB, less than 100.00% of Java online submissions for Available Captures for Rook.