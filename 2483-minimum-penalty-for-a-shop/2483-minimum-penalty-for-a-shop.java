class Solution {
    public int bestClosingTime(String customers) {
        int m = customers.length();
        int penalty = 0;

        for(int i = 0;i < m;i++){
            if(customers.charAt(i) == 'Y'){
                penalty++;
            }
        }

        int minPenalty = penalty;
        int ans = 0;

        for(int i = 0;i < m;i++){
            char c = customers.charAt(i);
            if(c == 'Y'){
                penalty--;
            } 
            else {
                penalty++;
            }
            if(penalty < minPenalty){
                minPenalty = penalty;
                ans = i + 1;
            }
        }
        return ans;
    }
}
