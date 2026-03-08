class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int m = nums.length;
        char[] ans = new char[m];
        for (int i = 0; i < m; i++){
            ans[i] = nums[i].charAt(i) == '0' ? '1' : '0';
        }
        return new String(ans);
    }
}