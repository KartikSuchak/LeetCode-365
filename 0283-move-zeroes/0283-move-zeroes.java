class Solution {
    public void moveZeroes(int[] nums) {
        int m = nums.length;
        int [] res = new int[m];
        int index = 0;
        for(int i=0 ; i<m ; i++){
            if(nums[i] != 0){
                res[index] = nums[i];
                index++;
            }
        }
        for(int j=0 ; j<m ; j++){
            nums[j] = res[j];
        }
    }
}