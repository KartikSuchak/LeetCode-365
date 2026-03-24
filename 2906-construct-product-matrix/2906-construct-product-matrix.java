class Solution {
    int MOD = 12345;
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length, total = n*m;
        int[][] res = new int[n][m];
        long[] pref = new long[total], suf = new long[total];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                int idx = i*m+j;
                pref[idx] = idx>0 ? (pref[idx-1]*grid[i][j])%MOD : grid[i][j]%MOD;
            }
        for(int i=n-1;i>=0;i--)
            for(int j=m-1;j>=0;j--){
                int idx = i*m+j;
                suf[idx] = idx<total-1 ? (suf[idx+1]*grid[i][j])%MOD : grid[i][j]%MOD;
            }
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                int idx = i*m+j;
                long l = idx>0 ? pref[idx-1] : 1;
                long r = idx<total-1 ? suf[idx+1] : 1;
                res[i][j] = (int)((l*r)%MOD);
            }
        return res;
    }
}