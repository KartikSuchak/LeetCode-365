class Solution {
    public int firstMissingPositive(int[] nums) {
        int m = nums.length;
        Arrays.sort(nums);
        int number = 1;

        for(int i = 0 ; i < m ; i++){
            if(nums[i] > 0 && nums[i] == number){
                number++;
            }
            else if(nums[i] > number){
                return number;
            }
        }
        return number;
    }
}