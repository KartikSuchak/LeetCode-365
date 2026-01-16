class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        int MOD = 1000000007;

        int hlen = hFences.length;
        int vlen = vFences.length;

        int[] h = new int[hlen + 2];
        int[] v = new int[vlen + 2];

        h[0] = 1;
        h[hlen + 1] = m;
        for (int i = 0; i < hlen; i++) {
            h[i + 1] = hFences[i];
        }

        v[0] = 1;
        v[vlen + 1] = n;
        for (int i = 0; i < vlen; i++) {
            v[i + 1] = vFences[i];
        }

        Arrays.sort(h);
        Arrays.sort(v);

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < h.length; i++) {
            for (int j = i + 1; j < h.length; j++) {
                hs.add(h[j] - h[i]);
            }
        }

        int ans = -1;

        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                int d = v[j] - v[i];
                if (hs.contains(d)) {
                    ans = Math.max(ans, d);
                }
            }
        }
        if (ans == -1) return -1;
        long res = (long) ans * ans;
        return (int) (res % MOD);
    }
}