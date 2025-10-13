class Solution {
    public int findDuplicate(int[] nums) {
        int m = nums.length;
        int[] count = new int[m];

        for(int i = 0 ; i < m ; i++){
            count[nums[i]]++;
        }

        for(int i = 0 ; i < m ; i++){
            if(count[i] > 1){
                return i;
            }
        }
        return -1;
    }
}