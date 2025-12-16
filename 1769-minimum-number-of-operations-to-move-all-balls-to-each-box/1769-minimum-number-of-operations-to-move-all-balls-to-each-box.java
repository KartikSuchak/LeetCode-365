class Solution {
    public int[] minOperations(String boxes) {
        int m = boxes.length();
        int ans[] = new int[m];

        for(int i = 0 ; i < m ; i++){
            int operations = 0;
            for(int j = 0 ; j < m ; j++){
                if(boxes.charAt(j) == '1'){
                    operations = operations + Math.abs(i - j);
                }
            }
            ans[i] = operations;
        }
        return ans;
    }
}