class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<Integer> currentPath, int[] nums, int target, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(currentPath));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            currentPath.add(nums[i]);
            backtrack(currentPath, nums, target - nums[i], i);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}