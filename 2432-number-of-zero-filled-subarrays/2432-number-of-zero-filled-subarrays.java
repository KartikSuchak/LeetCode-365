class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long current = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == 0){
                current++;
                count = count + current;
            }
            else{
                current = 0;
            }
        }
        return count;
    }
}