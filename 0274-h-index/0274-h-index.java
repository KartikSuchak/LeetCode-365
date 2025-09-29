class Solution {
    public int hIndex(int[] citations) {
        int m = citations.length;
        int count = 0;
        Arrays.sort(citations);

        for(int i = m - 1 ; i >= 0 ; i--){
            if(citations[i] > count){
                count++;
            }
        }
        return count;
    }
}