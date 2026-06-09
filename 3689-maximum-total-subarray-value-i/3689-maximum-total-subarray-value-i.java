class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int x : nums) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }

        return 1L * k * (max - min);
    }
}