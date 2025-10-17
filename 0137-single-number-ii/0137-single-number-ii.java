class Solution {
    public int singleNumber(int[] nums) {
        int m = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for(int key : freq.keySet()){
            if(freq.get(key) == 1){
                return key;
            }
        }

        return -1;
    }
}