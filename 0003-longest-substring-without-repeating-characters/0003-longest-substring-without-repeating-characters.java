class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        int index = 0;
        int maxlen = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                index = Math.max(index, map.get(c) + 1);
            }
            map.put(c, i);
            maxlen = Math.max(maxlen, i - index + 1);
        }
        return maxlen;
    }
}