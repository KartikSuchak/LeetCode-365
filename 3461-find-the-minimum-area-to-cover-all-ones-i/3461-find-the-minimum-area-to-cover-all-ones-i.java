class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int height = 0;
        int width = 0;
        int minrow = m;
        int mincol = n;
        int maxrow = -1;
        int maxcol = -1;

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j] == 1){
                    if(i < minrow){
                        minrow = i;
                    }
                    if(j < mincol){
                        mincol = j;
                    }
                    if(i > maxrow){
                        maxrow = i;
                    }
                    if(j > maxcol){
                        maxcol = j;
                    }
                }
            }
        }
        height = (maxrow - minrow) +1;
        width = (maxcol - mincol) +1;

        return height * width;
    }
}