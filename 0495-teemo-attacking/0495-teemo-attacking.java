class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int m = timeSeries.length;
        int seconds = 0;
        for(int i=0 ; i<m-1 ; i++){
            if(timeSeries[i] + duration > timeSeries[i+1]){
                seconds = seconds + timeSeries[i+1] - timeSeries[i];
            }
            else{
                seconds = seconds + duration;
            }
        }
        seconds = seconds + duration;
        return seconds;
    }
}