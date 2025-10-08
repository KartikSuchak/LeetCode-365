class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        long strength = 0;

        int i = 0;

        while(i < n){
            int low = 0;
            int high = m - 1;
            int index = m;

            while(low <= high){
                int mid = (low + high) / 2;
                strength = (long)spells[i] * potions[mid];
                if(strength >= success){
                    index = mid;
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            pairs[i] = m - index;
            i++;
        }
        return pairs;
    }
}