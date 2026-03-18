class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        long[][] sum = new long[m][n];

        sum[0][0] = grid[0][0];

        for(int j = 1; j < n; j++){
            sum[0][j] = sum[0][j - 1] + grid[0][j];
        }

        for(int i = 1; i < m; i++){
            sum[i][0] = sum[i - 1][0] + grid[i][0];
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                sum[i][j] = grid[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
            }
        }

        int result = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(sum[i][j] <= k) result++;
            }
        }

        return result;
    }
}