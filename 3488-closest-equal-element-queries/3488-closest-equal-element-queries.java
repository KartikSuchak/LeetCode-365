class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int m = nums.length;
        Map<Integer, List<Integer>> indexMap = new HashMap<>();

        for (int i = 0; i < m; i++) {
            indexMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        List<Integer> answer = new ArrayList<>();

        for (int q : queries) {
            List<Integer> indices = indexMap.get(nums[q]);

            if (indices.size() == 1) {
                answer.add(-1);
                continue;
            }

            int pos = Collections.binarySearch(indices, q);
            int size = indices.size();
            int minDist = Integer.MAX_VALUE;

            int rightIdx = indices.get((pos + 1) % size);
            int d1 = Math.abs(q - rightIdx);
            minDist = Math.min(minDist, Math.min(d1, m - d1));

            int leftIdx = indices.get((pos - 1 + size) % size);
            int d2 = Math.abs(q - leftIdx);
            minDist = Math.min(minDist, Math.min(d2, m - d2));
            answer.add(minDist);
        }
        return answer;
    }
}