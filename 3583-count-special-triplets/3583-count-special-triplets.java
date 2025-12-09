class Solution{
    public int specialTriplets(int[] nums){
        long MOD = 1000000007L;
        int max = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        max *= 2;
        long[] left = new long[max + 1];
        long[] right = new long[max + 1];
        for(int i=0;i<nums.length;i++){
            right[nums[i]]++;
        }
        long ans = 0;
        for(int j=0;j<nums.length;j++){
            int mid = nums[j];
            right[mid]--;
            int need = mid * 2;
            if(need <= max){
                ans = (ans + left[need] * right[need]) % MOD;
            }
            left[mid]++;
        }
        return (int)ans;
    }
}
