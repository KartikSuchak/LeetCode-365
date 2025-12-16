class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int m = nums.length;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        
        for(int i = 0 ; i < m ; i++){
            if(nums[i] < pivot){
                left.add(nums[i]);
            }
            else if(nums[i] == pivot){
                p.add(nums[i]);
            }
            else{
                right.add(nums[i]);
            }
        }
        left.addAll(p);
        left.addAll(right);

        for(int i = 0 ; i < m ; i++){
            nums[i] = left.get(i);
        }
        return nums;
    }
}