class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] answer = new int[m][n];

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                answer[i][j] = matrix[i][j];
            }
        }
        for(int j = 0 ; j < n ; j++){
            int max = 0;
            for(int i = 0 ; i < m ; i++){
                if(matrix[i][j] != -1){
                    max = Math.max(max , matrix[i][j]);
                }
            }
            for(int i = 0; i < m; i++){
                if(matrix[i][j] == -1){
                    answer[i][j] = max;
                }
            }
        }
    return answer;
    }
}