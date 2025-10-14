class Solution {
    public int[] productExceptSelf(int[] nums) {
        int m = nums.length;
        int[] res = new int[m];

        res[0] = 1;

        for(int i = 1 ; i < m ; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for(int i = m - 1; i >= 0; i--){
            res[i] = res[i] * suffix;
            suffix = suffix * nums[i];
        }

        return res;
    }
}