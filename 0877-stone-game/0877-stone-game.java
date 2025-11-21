class Solution {
    public boolean stoneGame(int[] piles) {
        int m = piles.length;
        int i = 0;
        int j = m - 1;
        int a = 0;
        int b = 0;
        boolean aturn = true;

        while(i < j){
            if(piles[i] >= piles[j]){
                if(aturn){
                    a = a + piles[i];
                }
                else{
                    b = b + piles[i];
                }
                i++;
            }
            else{
                if(aturn){
                    a = a + piles[j];
                }
                else{
                    b = b + piles[j];
                }
                j--;
            }
        }
        if(a > b){
            return true;
        }
        else{
            return false;
        }
    }
}