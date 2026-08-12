class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        return solve(nums, nums.length);
    }
    private List<List<Integer>> solve(int[] nums, int n) {
        if (n == 1) {
            List<List<Integer>> base = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            list.add(nums[0]);
            base.add(list);
            return base;
        }
        List<List<Integer>> previous = solve(nums, n - 1);
        Set<List<Integer>> res = new LinkedHashSet<>();
        int value = nums[n - 1];

        for (List<Integer> permutation : previous) {
            for (int i = 0; i <= permutation.size(); i++) {
                List<Integer> current = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    current.add(permutation.get(j));
                }
                current.add(value);
                for (int j = i; j < permutation.size(); j++) {
                    current.add(permutation.get(j));
                }
                res.add(current);
            }
        }
        return new ArrayList<>(res);
    }
}