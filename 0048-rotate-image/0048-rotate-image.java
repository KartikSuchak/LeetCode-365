class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            int c=0;
            int d=n-1;
            while(c<d){
                int temp=matrix[i][c];
                matrix[i][c]=matrix[i][d];
                matrix[i][d]=temp;
                c++;
                d--;
            }
        }
    }
}