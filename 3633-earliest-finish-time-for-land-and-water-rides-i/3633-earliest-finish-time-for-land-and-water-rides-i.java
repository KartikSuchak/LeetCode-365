class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int n = landStartTime.length;
        int m = waterStartTime.length;

        int landFinish = Integer.MAX_VALUE;
        int opt1 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            landFinish = Math.min(landFinish, landStartTime[i] + landDuration[i]);
        }
        for (int i = 0; i < m; i++) {
            opt1 = Math.min(opt1, Math.max(landFinish, waterStartTime[i]) + waterDuration[i]);
        }

        int waterFinish = Integer.MAX_VALUE;
        int opt2 = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            waterFinish = Math.min(waterFinish, waterStartTime[i] + waterDuration[i]);
        }
        for (int i = 0; i < n; i++) {
            opt2 = Math.min(opt2, Math.max(waterFinish, landStartTime[i]) + landDuration[i]);
        }
        return Math.min(opt1, opt2);
    }
}