class Solution {
    public int concatenatedBinary(int n) {
        int bit = 0;
        long res = 0;
        final long MOD = (long)(1e9 + 7);
        for(int i=1;i<=n;i++){
            if((i&(i-1)) == 0) bit++;
            res = ((res << bit)+i)%MOD;
        }
        return (int)res;
    }
}