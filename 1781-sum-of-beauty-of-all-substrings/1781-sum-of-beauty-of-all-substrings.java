class Solution {
    public int beautySum(String s) {
        int m = s.length();
        int ans = 0;

        for(int i = 0 ; i < m ; i++){
            int[] freq = new int[26];

            for(int j = i ; j < m ; j++){
                freq[s.charAt(j)-'a']++;
                int max = 0;
                int min = Integer.MAX_VALUE;
                for(int k = 0 ; k < 26 ; k++){
                    if(freq[k]>0){
                        max = Math.max(max,freq[k]);
                        min = Math.min(min,freq[k]);
                    }
                }
                ans = ans + (max - min);
            }
        }
        return ans;
    }
}
