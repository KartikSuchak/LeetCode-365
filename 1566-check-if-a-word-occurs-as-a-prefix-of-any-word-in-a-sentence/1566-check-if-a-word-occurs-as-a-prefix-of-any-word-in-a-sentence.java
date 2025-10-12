class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sen = sentence.split(" ");
        int m = sen.length;

        for(int i = 0 ; i < m ; i++){
            String s = sen[i];
            if(s.indexOf(searchWord) == 0){
                return i + 1;
            }
        }
        return -1;
    }
}