class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i = 1; i < n; i++){
            res = rle(res);
        }
        return res;
    }
    private String rle(String s) {
        StringBuilder out = new StringBuilder();
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)) count++;
            else{
                out.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        out.append(count).append(s.charAt(s.length() - 1));
        return out.toString();
    }
}
