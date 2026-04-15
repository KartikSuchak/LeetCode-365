class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int m = words.length;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            if (words[i].equals(target)) {
                int forwardDist = Math.abs(i - startIndex);
                int backwardDist = m - forwardDist;
                minDist = Math.min(minDist, Math.min(forwardDist, backwardDist));
            }
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}