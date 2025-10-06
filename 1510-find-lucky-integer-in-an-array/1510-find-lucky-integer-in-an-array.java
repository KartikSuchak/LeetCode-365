class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        int ans = -1;

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int key : freq.keySet()){
            if(key == freq.get(key)){
                ans = Math.max(ans , key);
            }
        }
        return ans;
    }
}