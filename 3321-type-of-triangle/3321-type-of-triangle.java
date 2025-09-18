class Solution {
    public String triangleType(int[] nums) {
        int m = 3;
        
        if(nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1] || nums[1] + nums[2] <= nums[0]){
            return "none";
        } 
        if(nums[0] == nums[1] && nums[1] == nums[2]){
            return "equilateral";
        }
        for(int i = 0 ; i < 3 ; i++){
            if(nums[i] == nums[(i+1) % 3] && nums[i] != nums[(i + 2)% 3]){
                return "isosceles";
            }
        }
        return "scalene"; 
    }
}