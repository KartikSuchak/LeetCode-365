class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;

        int[] parent = new int[n];
        for(int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for(int[] e : allowedSwaps) {
            int a = find(parent, e[0]);
            int b = find(parent, e[1]);
            if(a != b) {
                parent[a] = b;
            }
        }

        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int p = find(parent, i);
            map.putIfAbsent(p, new HashMap<>());
            HashMap<Integer, Integer> freq = map.get(p);
            freq.put(source[i], freq.getOrDefault(source[i], 0) + 1);
        }

        int res = 0;

        for(int i = 0; i < n; i++) {
            int p = find(parent, i);
            HashMap<Integer, Integer> freq = map.get(p);

            if(freq.getOrDefault(target[i], 0) > 0) {
                freq.put(target[i], freq.get(target[i]) - 1);
            } else {
                res++;
            }
        }

        return res;
    }

    int find(int[] parent, int x) {
        while(parent[x] != x) {
            x = parent[x];
        }
        return x;
    }
}