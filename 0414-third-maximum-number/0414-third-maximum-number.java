class Solution {
    public int thirdMax(int[] nums) {
        int m = nums.length;
        Arrays.sort(nums);
        int count = 1;
        
        for (int i = m - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                count++;
                if (count == 3) {
                    return nums[i];
                }
            }
        }
        return nums[m - 1];
    }
}
