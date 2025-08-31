class Solution {
    public int searchInsert(int[] nums, int target) {
        int m = nums.length;
        for(int i=0 ; i<m ; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return m;
    }
}