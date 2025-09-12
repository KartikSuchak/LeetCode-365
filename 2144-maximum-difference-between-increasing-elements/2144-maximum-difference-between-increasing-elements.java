class Solution {
    public int maximumDifference(int[] nums) {
        int m = nums.length;
        int i = 0;
        int j = m - 1;
        int diff = -1;

        while(i < m - 1){
            j = m - 1;
            while(i < j){
                if(nums[i] < nums[j]) {
                    diff = Math.max(diff, nums[j] - nums[i]);
                }
                j--;
            }
            i++;
        }
        return diff;
    }
}
