class Solution {
    public int removeDuplicates(int[] nums) {
        int m = nums.length;
        if(m == 0){
            return 0;
        } 
        int i = 0;
        for(int j = 1; j < m; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
