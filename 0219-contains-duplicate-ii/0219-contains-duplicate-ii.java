class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        boolean ans=false;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])>k)ans=false;
                else return true;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}