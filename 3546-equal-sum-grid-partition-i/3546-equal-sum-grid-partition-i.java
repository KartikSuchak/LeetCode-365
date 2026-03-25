class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long[][] sumGrid = new long[m][n];

        long prefSum = 0;
        for (int j = 0; j < n; j++) {
            prefSum += grid[0][j];
            sumGrid[0][j] = prefSum;
        }

        for (int i = 1; i < m; i++) {
            prefSum = 0;
            for (int j = 0; j < n; j++) {
                prefSum += grid[i][j];
                sumGrid[i][j] = prefSum + sumGrid[i - 1][j];
            }
        }

        long totalSum = sumGrid[m - 1][n - 1];

        for (int j = 0; j < n - 1; j++) {
            if (sumGrid[m - 1][j] == totalSum - sumGrid[m - 1][j]) {
                return true;
            }
        }

        for (int i = 0; i < m - 1; i++) {
            if (sumGrid[i][n - 1] == totalSum - sumGrid[i][n - 1]) {
                return true;
            }
        }

        return false;
    }
}