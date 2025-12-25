class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int m = happiness.length;
        Arrays.sort(happiness);
        long max_happiness = 0;
        int pos = 0; 
        int i = m - 1;

        while(i >= m - k){
            int value = happiness[i] - pos;
            if(value > 0){
                max_happiness = max_happiness + value;
            }
            pos++;
            i--;
        }
        return max_happiness;
    }
}