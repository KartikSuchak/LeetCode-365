class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        int m = cells.length;
        n = (n - 1) % 14 + 1;
        
        for(int i = 0 ; i < n ; i++){
            int[] day = new int[8];
            for(int j = 1 ; j < m - 1 ; j++){
                if(cells[j - 1] == cells[j + 1]){
                    day[j] = 1;
                }
            }
            cells = day;
        }
        return cells;
    }
}