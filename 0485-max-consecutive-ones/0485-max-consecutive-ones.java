class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int streak = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] == 1){
                count++;
                streak = Math.max(streak , count);
            }
            else{
                count = 0;
            }
        }
        return streak;
    }
}