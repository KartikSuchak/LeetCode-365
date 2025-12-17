class Solution {
    public int[] rearrangeArray(int[] nums) {
        int m = nums.length;
        int[] ans = new int[m];
        int positive = 0;
        int negative = 1;

        for(int x : nums){
            if(x > 0){
                ans[positive] = x;
                positive = positive + 2;
            }
            else{
                ans[negative] = x;
                negative = negative + 2;
            }
        }
        return ans;
    }
}