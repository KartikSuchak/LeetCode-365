class Solution {
    public int maxRotateFunction(int[] nums) {
        int m = nums.length;
        long total = 0, curr = 0;
        for (int i = 0; i < m; i++) {
            total += nums[i];
            curr += (long)i * nums[i];
        }

        long res = curr;
        for (int k = 1; k < m; k++) {
            curr = curr + total - (long)m * nums[m - k];
            res = Math.max(res, curr);
        }
        return (int)res;
    }
}