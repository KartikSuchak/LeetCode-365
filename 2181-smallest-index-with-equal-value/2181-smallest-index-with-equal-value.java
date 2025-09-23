class Solution {
    public int smallestEqual(int[] nums) {
        int m = nums.length;

        for(int i = 0 ; i < m ; i++){
            if(i % 10 == nums[i]){
                return i;
            }
        }
        return -1;
    }
}