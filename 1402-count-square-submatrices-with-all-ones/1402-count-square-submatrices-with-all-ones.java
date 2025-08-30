class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;

        int[][] submatrix = new int[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 1){
                    if(i == 0 || j == 0){
                        submatrix[i][j] = 1;
                    } 
                    else {
                        submatrix[i][j] = 1 + Math.min(submatrix[i - 1][j],Math.min(submatrix[i][j - 1],submatrix[i - 1][j - 1]));
                    }
                    count = count + submatrix[i][j];
                }
            }
        }
        return count;
    }
}
