class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int i,j=0;
        int n = fruits.length;
        int unplaced = 0;
        for(i=0 ; i<n ; i++){
            for(j=0 ; j<n ; j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = -1;
                    break;
                }
            }
            if(j == n){
                unplaced++;
            }
        }
        return unplaced;
    }
}