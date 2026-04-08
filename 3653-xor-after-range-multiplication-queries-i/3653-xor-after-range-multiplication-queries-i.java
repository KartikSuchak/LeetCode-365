class Solution {
    static final int M = 1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            long idx = queries[i][0];
            while (idx <= queries[i][1]) {
                nums[(int)idx] = (int)((1L * nums[(int)idx] * queries[i][3]) % M);
                idx += queries[i][2];
            }
        }
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}