class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int m = nums.length;
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum = sum + nums[i];
        }
        int max = sum;
        for(int i = 1 ; i <= m - k ; i++){
            sum = sum - nums[i - 1] + nums[i + k - 1];
            if(sum > max){
                max = sum;
            }
        }
        return (double)max / k;
    }
}