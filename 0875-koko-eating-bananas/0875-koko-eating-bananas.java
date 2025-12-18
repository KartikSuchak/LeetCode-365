class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int m = piles.length;
        
        int max = piles[0];
        for(int i = 1; i < m ; i++){
            max = Math.max(max, piles[i]);
        }

        int l = 1;
        int r = max;
        int ans = max;

        while(l <= r){
            int mid = l + (r - l)/2;
            long hours = 0;

            for(int x : piles){
                hours = hours + x / mid;
                if(x % mid != 0){
                    hours++;
                }
            }
            if(hours <= h){
                ans = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
}