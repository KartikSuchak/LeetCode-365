class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char digit = board[i][j];
                if (digit != '.') {
                    
                    for (int col = 0; col < 9; col++) {
                        if (col != j && board[i][col] == digit) 
                            return false;
                    }
                    
                    for (int row = 0; row < 9; row++) {
                        if (row != i && board[row][j] == digit) 
                            return false;
                    }
                    
                    int rowstart = (i / 3) * 3;
                    int colstart = (j / 3) * 3;
                    for (int k = rowstart; k < rowstart + 3; k++) {
                        for (int l = colstart; l < colstart + 3; l++) {
                            if ((k != i || l != j) && board[k][l] == digit) 
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
