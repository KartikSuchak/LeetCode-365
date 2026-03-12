class Solution {
    class DSU {
        int[] parent;
        DSU(int n){
            parent = new int[n];
            for(int i = 0; i < n; i++)
                parent[i] = i;
        }
        int find(int x){
            if(parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        boolean union(int a, int b){
            int pa = find(a);
            int pb = find(b);
            if(pa == pb)
                return false;
            parent[pb] = pa;
            return true;
        }
    }

    public int maxStability(int n, int[][] edges, int k) {
        int left = 1;
        int right = 200000;
        int ans = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(canBuild(n, edges, k, mid)){
                ans = mid;
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return ans;
    }

    boolean canBuild(int n, int[][] edges, int k, int x){
        DSU dsu = new DSU(n);
        int used = 0;
        int upgrades = 0;
        List<int[]> optional = new ArrayList<>();

        for(int[] e : edges){
            int u = e[0];
            int v = e[1];
            int s = e[2];
            int must = e[3];
            if(must == 1){
                if(s < x)
                    return false;
                if(!dsu.union(u,v))
                    return false;
                used++;
            }
            else
                optional.add(e);
        }
        for(int[] e : optional){
            int u = e[0];
            int v = e[1];
            int s = e[2];
            if(s >= x){
                if(dsu.union(u,v))
                    used++;
            }
        }
        for(int[] e : optional){
            int u = e[0];
            int v = e[1];
            int s = e[2];
            if(s < x && 2*s >= x){
                if(dsu.union(u,v)){
                    upgrades++;
                    used++;
                    if(upgrades > k)
                        return false;
                }
            }
        }
        return used == n-1;
    }
}