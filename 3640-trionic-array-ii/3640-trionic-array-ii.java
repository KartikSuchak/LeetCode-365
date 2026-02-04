class Solution {
    public long maxSumTrionic(int[] nums) {
        int m = nums.length;
        long res = - (long) 1e16;
        for (int p = 1; p < m - 2; p++) {
            int l = p, q = p;
            long midSum = nums[p];
            while (q + 1 < m && nums[q + 1] < nums[q]) {
                q++;
                midSum += nums[q];
            }
            if (q == p) continue;
            int r = q;
            long left = 0, right = 0;
            long lx = Long.MIN_VALUE, rx = Long.MIN_VALUE;
            while (l - 1 >= 0 && nums[l - 1] < nums[l]) {
                l--;
                left += nums[l];
                lx = Math.max(lx, left);
            }
            if (l == p) continue;
            while (r + 1 < m && nums[r + 1] > nums[r]) {
                r++;
                right += nums[r];
                rx = Math.max(rx, right);
            }
            if (r == q) continue;
            res = Math.max(res, lx + midSum + rx);
            p = r - 1;
        }
        return res;
    }
}