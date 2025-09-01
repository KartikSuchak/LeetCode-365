class Solution {
    public boolean containsDuplicate(int[] nums) {
        int m = nums.length;
        int count = 0;
        int maxcount = 0;

        Arrays.sort(nums);
        for(int i=0 ; i<m-1 ; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}