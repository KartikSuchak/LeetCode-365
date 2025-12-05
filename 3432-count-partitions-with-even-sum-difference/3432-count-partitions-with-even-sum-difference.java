class Solution{
    public int countPartitions(int[] nums){
        int m = nums.length;
        int total = 0;

        for (int i = 0; i < m; i++){
            total += nums[i];
        }
        if (total % 2 == 0){
            return m - 1;
        } else{
            return 0;
        }
    }
}
