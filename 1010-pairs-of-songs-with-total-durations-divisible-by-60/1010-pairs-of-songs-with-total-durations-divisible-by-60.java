class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int m = time.length;
        long count = 0;
        int[] remainder = new int[60];

        for(int x : time){
            remainder[x % 60]++;
        }
        count = count + (long)remainder[0] * (remainder[0] - 1) / 2;
        count = count +(long) remainder[30] * (remainder[30] - 1) / 2;
        for(int i = 1 ; i < 30 ; i++){
            count = count + (long)remainder[i] * remainder[60 - i];
        }
        return (int)count;
    }
}