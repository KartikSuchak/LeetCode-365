class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int m = mat[0].length;
        for(int k=0; k<4; k++){
            boolean match = true;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(mat[i][j]!=target[i][j]){
                        match = false;
                        break;
                    }
                }
            }
            if(match)return true;
            for(int i=0; i<n; i++){
                for(int j=i; j<m; j++){
                    int temp =mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
            for(int i=0; i<n; i++){
                int left =0;
                int right = m-1;
                while(left<=right){
                    int temp = mat[i][right];
                    mat[i][right]=mat[i][left];
                    mat[i][left]=temp;
                    left++;
                    right--;
                }
            }
        }
        return false;
    }
}