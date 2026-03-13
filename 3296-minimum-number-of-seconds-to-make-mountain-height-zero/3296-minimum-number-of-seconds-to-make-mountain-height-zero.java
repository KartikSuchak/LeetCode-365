class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long low = 1;
        long high = 10000000000000000L;

        while (low < high) {
            long mid = (low + high) >> 1;
            long totalLayers = 0;
            for (int t : workerTimes) {
                if (totalLayers >= mountainHeight)
                    break;
                long layers = (long)(Math.sqrt((2.0 * mid) / t + 0.25) - 0.5);
                totalLayers += layers;
            }
            if (totalLayers >= mountainHeight)
                high = mid;
            else
                low = mid + 1;
        }
        return low;
    }
}