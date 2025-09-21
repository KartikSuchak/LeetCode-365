class Solution {
    public int minOperations(int[] nums, int k) {
        int m = nums.length;
        int count = 0;

        for(int i = 0 ; i < m ; i++){
            if(nums[i] < k){
                count++;
            }
        }
        return count;
    }
}