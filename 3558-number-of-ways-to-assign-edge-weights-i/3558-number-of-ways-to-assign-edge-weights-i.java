class Solution {
    static final long MOD = 1_000_000_007L;
    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        int d = dfs(1, 0, graph);
        return (int) modPow(2, d - 1);
    }

    private int dfs(int node, int prev, List<Integer>[] graph) {
        int dist = 0;
        for (int c : graph[node]) {
            if (c != prev) {
                dist = Math.max(dist, dfs(c, node, graph) + 1);
            }
        }
        return dist;
    }

    private long modPow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % MOD;
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}