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

                    int r = i-k, c = j;
                    for(int t = 0; t < k; t++) sum += grid[r+t][c+t];

                    r = i; c = j+k;
                    for(int t = 0; t < k; t++) sum += grid[r+t][c-t];

                    r = i+k; c = j;
                    for(int t = 0; t < k; t++) sum += grid[r-t][c-t];

                    r = i; c = j-k;
                    for(int t = 0; t < k; t++) sum += grid[r-t][c+t];

                    set.add(sum);
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        int size = Math.min(3, list.size());
        int[] ans = new int[size];

        for(int i = 0; i < size; i++)
            ans[i] = list.get(i);

        return ans;
    }
}