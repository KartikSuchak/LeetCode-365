class Solution {
    public int numberOfWays(String corridor) {
        int n = corridor.length();
        long ways = 1;
        int seats = 0;
        int plants = 0;
        int MOD = 1_000_000_007;

        for( int i = 0 ; i < n ; i++){
            char ch = corridor.charAt(i);
            if(ch == 'S'){
                seats++;
                if(seats > 2 && seats % 2 == 1){
                    ways =(ways * (plants + 1)) % MOD;
                    plants = 0;
                }
            } 
            else{
                if(seats >= 2 && seats % 2 == 0){
                    plants++;
                }
            }
        }
        if(seats < 2 || seats % 2 != 0){
            return 0;
        }
        return (int)ways;
    }
}