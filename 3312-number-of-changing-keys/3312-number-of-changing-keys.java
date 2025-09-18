class Solution {
    public int countKeyChanges(String s) {
        int m = s.length();
        s = s.toLowerCase();
        int count = 0;

        for(int i = 1 ; i < m ; i++){
            if(s.charAt(i) != s.charAt(i - 1)){
                count++;
            }
        }
        return count;
    }
}