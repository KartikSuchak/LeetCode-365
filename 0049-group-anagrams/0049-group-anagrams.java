class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        Map<String, List<String>> ans = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];

            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }

            String str = Arrays.toString(count);

            ans.putIfAbsent(str, new ArrayList<>());
            ans.get(str).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}