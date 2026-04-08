class Solution {
    static final int M = 1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        long[] mul = new long[n];
        for (int i = 0; i < n; i++) {
            mul[i] = 1;
        }
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];
            for (int idx = l; idx <= r; idx += k) {
                mul[idx] = (mul[idx] * v) % M;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int val = (int)((nums[i] * mul[i]) % M);
            ans = ans ^ val;
        }
        return ans;
    }
}