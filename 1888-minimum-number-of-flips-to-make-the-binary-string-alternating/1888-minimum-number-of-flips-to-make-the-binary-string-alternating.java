class Solution {
    public int minFlips(String s) {
        int m = s.length();
        int res = m;
        int[] op = {0, 0};

        for (int i = 0; i < m; i++){
            op[(s.charAt(i) ^ i) & 1]++;
        }
        for (int i = 0; i < m; i++) {
            op[(s.charAt(i) ^ i) & 1]--;
            op[(s.charAt(i) ^ (m + i)) & 1]++;
            res = Math.min(res, Math.min(op[0], op[1]));
        }
        return res;
    }
}