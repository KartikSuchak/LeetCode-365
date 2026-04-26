class Solution {
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};

    public boolean containsCycle(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j]){
                    if(dfs(i, j, -1, -1, grid, visited)) return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int x, int y, int px, int py, char[][] grid, boolean[][] visited){
        visited[x][y] = true;

        int m = grid.length;
        int n = grid[0].length;

        for(int d = 0; d < 4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx < 0 || ny < 0 || nx >= m || ny >= n) continue;
            if(grid[nx][ny] != grid[x][y]) continue;

            if(visited[nx][ny] && !(nx == px && ny == py)) return true;

            if(!visited[nx][ny]){
                if(dfs(nx, ny, x, y, grid, visited)) return true;
            }
        }
        return false;
    }
}