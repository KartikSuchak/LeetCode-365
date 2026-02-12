class Solution {
    public int longestBalanced(String s) {
        int m = s.length();
        int max = 0;

        for(int i = 0 ; i < m ; i++){
            int[] count = new int[26];
            int distinct = 0;
            int maxFreq = 0;

            for(int j = i ; j < m ; j++){
                char c = s.charAt(j);
                int idx = c - 'a';

                if(count[idx] == 0){
                    distinct++;
                }

                count[idx]++;
                maxFreq = Math.max(maxFreq , count[idx]);

                int length = j - i + 1;

                if(length == distinct * maxFreq){
                    max = Math.max(max , length);
                }
            }
        }
        return max;
    }
}
