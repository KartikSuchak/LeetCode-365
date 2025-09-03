class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;

        while (j < n) {
            if (nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }

        j = i; 

        while (j < n) {
            if (nums[j] == 1) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }
}
