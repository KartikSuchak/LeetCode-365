class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int m = nums.length;
        int sum = 0;
        int count = 0;

        for(int i = 0 ; i < m ; i++){
            sum = sum + nums[i];
            if(sum == 0){
                count++;
            }
        }
        return count;
    }
}