class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;

        for (int r = 0; r < m; r++) {
            int empty = n - 1;
            for (int c = n - 1; c >= 0; c--) {
                if (box[r][c] == '*') {
                    empty = c - 1;
                }
                else if (box[r][c] == '#') {
                    char temp = box[r][c];
                    box[r][c] = box[r][empty];
                    box[r][empty] = temp;
                    empty--;
                }
            }
        }

        char[][] ans = new char[n][m];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                ans[c][m - 1 - r] = box[r][c];
            }
        }
        return ans;
    }
}