class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++;
            }
        }
        return upper == 0
            || upper == word.length()
            || (upper == 1 && Character.isUpperCase(word.charAt(0)));
    }
}