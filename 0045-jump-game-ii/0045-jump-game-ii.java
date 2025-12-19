class Solution {
    public int jump(int[] nums) {
        int m = nums.length;
        int reach = 0;
        int count = 0;
        int end = 0;

        for(int i = 0 ; i < m - 1 ; i++){
            reach = Math.max(reach , i + nums[i]);
            if(i == end){
                count++;
                end = reach;
            }
        }
        return count;
    }
}