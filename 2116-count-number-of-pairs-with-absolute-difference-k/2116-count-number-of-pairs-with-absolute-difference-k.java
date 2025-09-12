class Solution {
    public int countKDifference(int[] nums, int k) {
        int m = nums.length;
        int i = 0;
        int count = 0;

        while(i < m){
            int j = i + 1;
            while(j < m){
                if(Math.abs(nums[i] - nums[j]) == k){
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}
