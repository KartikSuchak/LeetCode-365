class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;

        int[][] subrow = new int[m][n]; 

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1){
                    subrow[i][j] = (j == 0) ? 1 : subrow[i][j - 1] + 1;

                    int streak = subrow[i][j];
                    for(int k = i; k >= 0 && streak > 0; k--){
                        streak = Math.min(streak, subrow[k][j]);
                        count = count + streak;
                    }
                }
            }
        }
        return count;
    }
}