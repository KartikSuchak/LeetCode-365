class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length, n=arr[0].length;
        if(arr[0][0]==1) return 0;
        
        int[][] dp=new int[m][n];
        dp[0][0]=1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                if(i==0 &&  j==0) continue;
                int top=(i>0)?dp[i-1][j]:0; 
                int left=(j>0)?dp[i][j-1]:0; 
                dp[i][j]=top+left;
            }
        }
        return dp[m-1][n-1];
    }
}