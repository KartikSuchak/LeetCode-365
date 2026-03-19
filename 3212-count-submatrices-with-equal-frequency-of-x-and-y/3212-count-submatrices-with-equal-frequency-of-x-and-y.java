class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] px = new int[m][n];
        int[][] py = new int[m][n];

        if(grid[0][0] == 'X') px[0][0] = 1;
        if(grid[0][0] == 'Y') py[0][0] = 1;

        for(int j = 1; j < n; j++){
            px[0][j] = px[0][j - 1];
            py[0][j] = py[0][j - 1];

            if(grid[0][j] == 'X') px[0][j]++;
            if(grid[0][j] == 'Y') py[0][j]++;
        }

        for(int i = 1; i < m; i++){
            px[i][0] = px[i - 1][0];
            py[i][0] = py[i - 1][0];

            if(grid[i][0] == 'X') px[i][0]++;
            if(grid[i][0] == 'Y') py[i][0]++;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                px[i][j] = px[i - 1][j] + px[i][j - 1] - px[i - 1][j - 1];
                py[i][j] = py[i - 1][j] + py[i][j - 1] - py[i - 1][j - 1];

                if(grid[i][j] == 'X') px[i][j]++;
                if(grid[i][j] == 'Y') py[i][j]++;
            }
        }

        int result = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int x = px[i][j];
                int y = py[i][j];

                if(x == y && x > 0) result++;
            }
        }

        return result;
    }
}