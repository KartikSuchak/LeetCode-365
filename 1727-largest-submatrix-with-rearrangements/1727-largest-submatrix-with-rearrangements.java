class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, res = 0;
        for (int i = 1; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 1) matrix[i][j] = matrix[i - 1][j] + 1;
            }
        }

        for (int i = 0; i < m; ++i) {
            Arrays.sort(matrix[i]);
            for (int j = 1; j <= n; ++j) {
                res = Math.max(res, j * matrix[i][n - j]);
            }
        }
        return res;
    }
}