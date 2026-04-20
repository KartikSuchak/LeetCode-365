class Solution {
    public int maxDistance(int[] colors) {
        int m = colors.length;
        int maxDist = 0;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < m ; j++){
                if(colors[i] != colors[j]){
                    maxDist = Math.max(maxDist , Math.abs(i - j));
                }
            }
        }
        return maxDist;
    }
}