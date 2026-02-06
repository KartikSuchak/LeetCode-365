class Solution {
    public int minRemoval(int[] nums, int k) {
        int m = nums.length;
        Arrays.sort(nums);
        
        int i = 0;
        int len = 0;

        for(int j = 0 ; j < m ; j++){
            while((long) nums[j] > (long) nums[i] * k){
                i++;
            }
            len = Math.max(len , j - i + 1);
        }
        return m - len;
    }
}