class Solution {
    public int search(int[] nums, int target) {
        int m = nums.length;
        for(int i=0 ; i<m ; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}