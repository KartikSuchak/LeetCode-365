class Solution {
    public int[] searchRange(int[] nums, int target) {
        int m = nums.length;
        int i = 0;
        int j = m-1;
        int[] res = {-1, -1};

        while (i <= j) {
            if (nums[i] < target) {
                i++;
            } else if (nums[j] > target) {
                j--;
            } 
            else {
                if (nums[i] == target) res[0] = i;
                if (nums[j] == target) res[1] = j;
                break;
            }
        }
        return res;
    }
}