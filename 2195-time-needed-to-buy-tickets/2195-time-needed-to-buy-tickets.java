class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int m = tickets.length;
        int i = 0;
        int time = 0;

        while(i < m && tickets[k] != 0){
            if(tickets[i] > 0){
                time++;
                tickets[i]--;
            }
            i = (i + 1) % m;
        }
        return time;
    }
}