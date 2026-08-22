class Solution {
    private void combinations(int idx, int[] arr, int target,
                              HashSet<List<Integer>> list,
                              List<Integer> ds) {
        if (target == 0) {
            list.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > target) {
                break;
            }
            ds.add(arr[i]);
            combinations(i + 1, arr, target - arr[i], list, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(candidates);
        combinations(0, candidates, target, ans, new ArrayList<>());
        return new ArrayList<>(ans);
    }
}