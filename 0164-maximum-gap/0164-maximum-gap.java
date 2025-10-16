class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int m = nums.length;
        int max = 0;
        int diff = 0;

        if(m < 2){
            return 0;
        }

        for(int i = 0 ; i < m - 1 ; i++){
            diff = nums[i + 1] - nums[i];
            if(max < diff){
                max = diff;
            }
        }
        return max;
    }
}