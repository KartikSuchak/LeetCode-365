class Solution {
    public int countPrefixes(String[] words, String s) {
        int m = words.length;
        int count = 0;

        for(int i = 0 ; i < m ; i++){
            if(s.indexOf(words[i]) == 0){
                count++;
            }
        }
        return count;
    }
}