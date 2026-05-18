class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return 0;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.offer(0);
        visited[0] = true;
        int cnt = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int idx = q.poll();
                if (idx == n - 1)
                    return cnt;
                if (idx - 1 >= 0 && !visited[idx - 1]) {
                    visited[idx - 1] = true;
                    q.offer(idx - 1);
                }
                if (idx + 1 < n && !visited[idx + 1]) {
                    visited[idx + 1] = true;
                    q.offer(idx + 1);
                }
                if (graph.containsKey(arr[idx])) {
                    for (int nxt : graph.get(arr[idx])) {
                        if (!visited[nxt]) {
                            visited[nxt] = true;
                            q.offer(nxt);
                        }
                    }
                    graph.remove(arr[idx]);
                }
            }
            cnt++;
        }
        return -1;
    }
}