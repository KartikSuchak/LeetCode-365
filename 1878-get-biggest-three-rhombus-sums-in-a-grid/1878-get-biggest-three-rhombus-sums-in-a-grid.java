class Solution {
    public int[] getBiggestThree(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                set.add(grid[i][j]);

                for(int k = 1; ; k++){

                    if(i-k < 0 || i+k >= m || j-k < 0 || j+k >= n)
                        break;

                    int sum = 0;

                    for(int t = 0; t < k; t++){
                        sum += grid[i-k+t][j+t];
                        sum += grid[i+t][j+k-t];
                        sum += grid[i+k-t][j-t];
                        sum += grid[i-t][j-k+t];
                    }

                    set.add(sum);
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        int d = Math.min(3, list.size());
        int[] ans = new int[d];

        for(int i = 0; i < d; i++)
            ans[i] = list.get(i);

        return ans;
    }
}