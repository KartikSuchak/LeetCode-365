class Solution {
    public int minJumps(int[] nums) {
        Map<Integer, List<Integer>> port = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int tmp = nums[i];
            for (int d = 2; d * d <= tmp; d++) {
                if (tmp % d == 0) {
                    port.computeIfAbsent(d, k -> new ArrayList<>()).add(i);
                    while (tmp % d == 0) {
                        tmp /= d;
                    }
                }
            }
            if (tmp > 1) {
                port.computeIfAbsent(tmp, k -> new ArrayList<>()).add(i);
            }
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        int steps = 0;
        while (!q.isEmpty()) {
            int sz = q.size();
            while (sz-- > 0) {
                int i = q.poll();
                if (visited[i]) 
                    continue;
                visited[i] = true;
                if (i == n - 1) 
                    return steps;
                int num = nums[i];
                if (port.containsKey(num)) {
                    for (int nei : port.get(num)) {
                        q.offer(nei);
                    }
                    port.remove(num);
                }

                if (i + 1 < n) {
                    q.offer(i + 1);
                }

                if (i - 1 >= 0) {
                    q.offer(i - 1);
                }
            }
            steps++;
        }
        return steps;
    }
}