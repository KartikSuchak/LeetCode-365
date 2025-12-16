class Solution {
    public int[] minOperations(String boxes) {
        int m = boxes.length();
        int ans[] = new int[m];

        int balls = 0;
        int operations = 0;
        for(int i = 0 ; i < m ; i++){
            ans[i] = ans[i] + operations;
            if(boxes.charAt(i) == '1'){
                balls++;
            }
            operations = operations + balls;
        }

        balls = 0;
        operations = 0;
        for(int i = m - 1 ; i >=0 ; i--){
            ans[i] = ans[i] + operations;
            if(boxes.charAt(i) == '1'){
                balls++;
            }
            operations = operations + balls;
        }
        return ans;
    }
}