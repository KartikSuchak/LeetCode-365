class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int m = nums.length;
        int space = (int)Math.pow(2,m);
        int[] strings = new int[space];

        for(String num : nums){
            int val = Integer.parseInt(num, 2);
            strings[val]++;
        }

        for(int i = 0; i < space; i++){
            if(strings[i] == 0){
                String ans = Integer.toBinaryString(i);
                return "0".repeat(m - ans.length()) + ans;
            }
        }

        return "0".repeat(m);
    }
}