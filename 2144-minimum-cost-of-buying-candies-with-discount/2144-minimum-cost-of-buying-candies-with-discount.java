class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int totalCost = 0;
        int m = cost.length;
        int index = m - 1;

        while (index >= 0) {
            totalCost += cost[index];
            index--;
            if (index >= 0) {
                totalCost += cost[index];
                index--;
            }
            index--;
        }
        return totalCost;
    }
}