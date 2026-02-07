class Solution {
    public int minimumDeletions(String s) {
        int min = 0;
        int countb = 0;

        for(char c : s.toCharArray()){
            if( c == 'b'){
                countb++;
            }
            else if(countb != 0){
                min++;
                countb--;
            }
        }
        return min;
    }
}