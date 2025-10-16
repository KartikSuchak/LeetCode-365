class Solution {
    public boolean canJump(int[] nums) {
        int m = nums.length;
        int end = 0;

        for(int i = 0 ; i < m ; i++){
            if(i > end){
                return false;
            }
            end = Math.max(end , i + nums[i]);
        }
        return true;
    }
}