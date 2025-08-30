class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int max = 0;
        int left = 0;
        int[] count = new int[n];
        int types = 0;

        for (int i = 0; i < n; i++) {
            if (count[fruits[i]] == 0) {
                types++;
            }
            count[fruits[i]]++;
            while (types > 2) {
                count[fruits[left]]--;
                if (count[fruits[left]] == 0) {
                    types--;
                }
                left++;
            }
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
