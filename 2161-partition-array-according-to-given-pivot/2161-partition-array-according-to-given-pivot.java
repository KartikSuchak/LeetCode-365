class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int m = nums.length;
        int[] ans = new int[m];

        int freqless = 0;
        int freqpivot = 0;
        for(int x : nums){
            if(x < pivot){
                freqless++;
            }
            else if(x == pivot){
                freqpivot++;
            }
        }

        int left = 0;
        int p = freqless;
        int right = freqless + freqpivot;

        for(int i = 0 ; i < m ; i++){
            if(nums[i] < pivot){
                ans[left] = nums[i];
                left++;
            }
            else if(nums[i] == pivot){
                ans[p] = nums[i];
                p++;
            }
            else{
                ans[right] = nums[i];
                right++;
            }
        }
        return ans;
    }
}