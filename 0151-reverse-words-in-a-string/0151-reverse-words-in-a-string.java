class Solution {
    public String reverseWords(String s) {
        String[] string = s.trim().split("\\s+");
        int m = string.length;
        String res = "";

        for(int i = m - 1 ; i > 0 ; i--){
            res = res + string[i] + " ";
        }

        return res + string[0];
    }
}