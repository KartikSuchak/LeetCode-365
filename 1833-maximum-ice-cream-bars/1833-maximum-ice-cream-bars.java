class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;

        for(int i = 0; i < costs.length; i++){
            max = Math.max(max, costs[i]);
        }

        int[] freq = new int[max + 1];
        
        for(int i = 0; i < costs.length; i++){
            freq[costs[i]]++;
        }

        int count = 0;
        
        for(int i = 1; i <= max; i++){
            while(freq[i] > 0 && coins >= i){
                coins = coins - i;
                freq[i]--;
                count++;
            }
        }
        return count;
    }
}