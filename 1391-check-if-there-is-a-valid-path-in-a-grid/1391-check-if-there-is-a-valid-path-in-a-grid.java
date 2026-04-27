class Solution {
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};

    public boolean hasValidPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        return dfs(0, 0, grid, visited);
    }

    public boolean dfs(int x, int y, int[][] grid, boolean[][] visited){
        int m = grid.length;
        int n = grid[0].length;

        if(x == m - 1 && y == n - 1) return true;

        visited[x][y] = true;

        for(int d = 0; d < 4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
            if(visited[nx][ny]) continue;

            if(isValid(grid[x][y], grid[nx][ny], d)){
                if(dfs(nx, ny, grid, visited)) return true;
            }
        }
        return false;
    }

    public boolean isValid(int a, int b, int d){
        if(d == 0){
            if((a == 2 || a == 3 || a == 4) && (b == 2 || b == 5 || b == 6)) return true;
        }
        else if(d == 1){
            if((a == 2 || a == 5 || a == 6) && (b == 2 || b == 3 || b == 4)) return true;
        }
        else if(d == 2){
            if((a == 1 || a == 4 || a == 6) && (b == 1 || b == 3 || b == 5)) return true;
        }
        else{
            if((a == 1 || a == 3 || a == 5) && (b == 1 || b == 4 || b == 6)) return true;
        }
        return false;
    }
}