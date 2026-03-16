class Solution {
    public int[] getBiggestThree(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        TreeSet<Integer> set = new TreeSet<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                add(set, grid[i][j]);

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

                    add(set, sum);
                }
            }
        }

        int[] ans = new int[set.size()];
        int i = set.size()-1;

        for(int val : set){
            ans[i--] = val;
        }

        return ans;
    }

    void add(TreeSet<Integer> set, int val){
        set.add(val);
        if(set.size() > 3)
            set.pollFirst();
    }
}