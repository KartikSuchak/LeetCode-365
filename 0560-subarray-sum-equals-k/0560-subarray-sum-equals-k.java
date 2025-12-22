class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
         
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0 , 1);

        for(int x : nums){
            sum = sum + x;
            if(map.containsKey(sum - k)){
                count = count + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum , 0) + 1);
        }
        return count;
    }
}