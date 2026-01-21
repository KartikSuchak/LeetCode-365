class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int m = arr.length;
        int[] prefix = new int[m];
        prefix[0] = arr[0];
        for(int i = 1;i < m;i++){
            prefix[i] = prefix[i - 1] ^ arr[i];
        }
        int q = queries.length;
        int[] ans = new int[q];
        for(int i = 0;i < q;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            if(l == 0){
                ans[i] = prefix[r];
            }else{
                ans[i] = prefix[r] ^ prefix[l - 1];
            }
        }
        return ans;
    }
}