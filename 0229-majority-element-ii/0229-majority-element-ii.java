class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int m = nums.length;

        for(int i = 0 ; i < m ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        int minimum = (int) (m / 3) + 1;

        for(Map.Entry<Integer,Integer> x : map.entrySet()){
            if(x.getValue() >= minimum){
                list.add(x.getKey());
            }
        }
        return list;
    }
}