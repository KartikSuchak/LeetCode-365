class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int m = nums.length;

        int[] count = new int[m + 1];

        for(int i = 0 ; i < m ; i++){
            count[nums[i]]++;
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i <= m ; i++){
            if(count[i] == 2){
                list.add(i);
            }
        }
        return list;
    }
}