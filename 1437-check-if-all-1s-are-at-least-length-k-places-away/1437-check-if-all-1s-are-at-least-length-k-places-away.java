class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int m = nums.length;
        int index = -1;

        for(int i = 0 ; i < m ; i++){
            if(nums[i] == 1 && index == -1){
                index = i;
            }
            else if(nums[i] == 1 && (i - index - 1) < k){
                return false;
            }
            else if(nums[i] == 1){
                index = i;
            }
        }
        return true;
    }
}