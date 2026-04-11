class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int ans = Integer.MAX_VALUE;
        for (List<Integer> indices : map.values()) {
            if (indices.size() < 3) continue;
            for (int i = 0; i + 2 < indices.size(); i++) {
                int dist = 2 * (indices.get(i + 2) - indices.get(i));
                ans = Math.min(ans, dist);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}