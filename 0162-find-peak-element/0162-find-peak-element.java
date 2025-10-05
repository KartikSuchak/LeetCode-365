class Solution {
    public int findPeakElement(int[] nums) {
        int m = nums.length;
        int max = nums[0];
        int index = 0;
        for(int i = 1 ; i < m ; i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
}