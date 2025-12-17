class Solution {
    public int[] rearrangeArray(int[] nums) {
        int m = nums.length;
        int[] ans = new int[m];
        int positive = 0;
        int negative = 1;

        for(int i = 0 ; i < m ; i++){
            if(nums[i] > 0){
                ans[positive] = nums[i];
                positive = positive + 2;
            }
            else{
                ans[negative] = nums[i];
                negative = negative + 2;
            }
        }
        return ans;
    }
}