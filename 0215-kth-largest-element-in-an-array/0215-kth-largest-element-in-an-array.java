class Solution {
    public int findKthLargest(int[] nums, int k) {
        int m = nums.length;
        Arrays.sort(nums);
        return nums[m - k];
    }
}