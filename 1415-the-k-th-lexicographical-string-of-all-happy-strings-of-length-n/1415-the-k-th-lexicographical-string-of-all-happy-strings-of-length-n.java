class Solution {
    public String getHappyString(int n, int k) {
        int total = 3 * (1 << (n - 1));
        if (k > total) return "";

        StringBuilder res = new StringBuilder();
        char[] chars = {'a', 'b', 'c'};

        for (int i = 0; i < n; i++) {
            int remaining = n - i - 1;
            int block = 1 << remaining;
            for (char c : chars) {
                if (i > 0 && res.charAt(i - 1) == c) continue;

                if (k > block) {
                    k -= block; // Skip this entire lexicographical block
                } else {
                    res.append(c);
                    break;
                }
            }
        }
        return res.toString();
    }
}