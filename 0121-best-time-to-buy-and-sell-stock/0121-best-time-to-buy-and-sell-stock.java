class Solution {
    public int maxProfit(int[] prices) {
        int m = prices.length;
        int min = 10001;
        int profit = 0;
        for(int i=0 ; i<m ; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else if(prices[i] - min > profit){
                profit = prices[i] - min;
            }
        }
        return profit;
    }
}