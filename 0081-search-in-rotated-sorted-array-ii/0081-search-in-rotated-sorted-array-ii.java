class Solution {
    public boolean search(int[] nums, int target) {
        int m = nums.length;
        Set<Integer> res = new HashSet<>();
        for(int i = 0 ; i < m ; i++){
            res.add(nums[i]);
        }
        return res.contains(target);
    }
}