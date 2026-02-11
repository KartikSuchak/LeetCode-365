class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int m = s.length();

        boolean[] dp = new boolean[m + 1];
        dp[0] = true;

        for (int i = 0; i < m; i++) {
            if (!dp[i]) continue;

            for (int j = i + 1; j <= m; j++) {
                if (set.contains(s.substring(i, j))) {
                    dp[j] = true;
                }
            }
        }
        return dp[m];
    }
}