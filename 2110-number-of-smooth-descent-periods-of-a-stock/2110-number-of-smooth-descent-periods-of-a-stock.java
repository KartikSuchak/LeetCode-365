class Solution {
    public long getDescentPeriods(int[] prices) {
        int m = prices.length;
        int count = 1;
        long res = 1;

        for(int i = 0 ; i < m - 1 ; i++){
            if(prices[i] - 1 == prices[i + 1]){
                count++;
            }
            else{
                count = 1;
            }
            res = res + count;
        }
        return res;
    }
}