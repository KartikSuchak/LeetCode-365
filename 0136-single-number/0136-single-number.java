class Solution {
    public int singleNumber(int[] nums) {
        int m = nums.length;
        Arrays.sort(nums);
        for(int i=0 ; i<m-1 ; i=i+2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[m-1];
    }
}