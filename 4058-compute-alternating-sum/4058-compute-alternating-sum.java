class Solution {
    public int alternatingSum(int[] nums) {
        int m = nums.length;
        int sum = 0;
        for(int i = 0 ; i < m ; i++){
            if(i  % 2 == 0){
                sum = sum + nums[i];
            }
            else{
                sum = sum - nums[i];
            }
        }
        return sum;
    }
}