class Solution {
    public boolean isTrionic(int[] nums) {
        int m = nums.length;
        if(m < 4){
            return false;
        }
        int i = 0;
        while(i < m - 1 && nums[i] < nums[i + 1]){
            i++;
        }
        if(i == 0 || i == m - 1){
            return false;
        }
        
        int p = i;
        
        while(i < m - 1 && nums[i] > nums[i + 1]){
            i++;
        }
        if(i == p || i == m - 1){
            return false;
        }
        
        while(i < m - 1 && nums[i] < nums[i + 1]){
            i++;
        }
        return i == m - 1;
    }
}