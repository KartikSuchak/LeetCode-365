class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int m = nums.length;
        int[] result = new int[m];
        int i = 0;

        while(i < m){
            int idx = (i + nums[i]) % m;
            if(idx < 0){
                idx = idx + m;
            }
            result[i] = nums[idx];
            i++;
        }
        return result;
    }
}
