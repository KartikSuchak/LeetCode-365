class Solution {
    public String largestGoodInteger(String num) {
        for(int i=9 ; i>=0 ; i--){
            String substring = "" +i+i+i;
            if(num.contains(substring)){
                return substring;
            }
        }
        return "";
    }
}