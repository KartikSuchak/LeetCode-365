class Solution {
    public boolean check(int[] nums) {
        int m = nums.length;
        int diff = 0;

        for(int i = 0 ; i < m ; i++){
            if(nums[i] > nums[(i + 1) % m]){
                diff++;
            }
        }
        if(diff <= 1){
            return true;
        }
        else{
            return false;
        }
    }
}