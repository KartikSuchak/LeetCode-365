class Solution {
    public int maxOperations(int[] nums) {
        int m = nums.length;
        int i = 0;
        int count = 0;
        int score = nums[0] + nums[1];

        while(m - i >= 2){
            if(nums[i] + nums[i + 1] == score){
                count ++;
                i = i + 2;
            }
            else{
                break;
            }
        }
        return count;
    }
}