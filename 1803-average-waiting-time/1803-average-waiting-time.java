class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currenttime = 0;
        double time = 0;

        for(int[] customer : customers){
            int arrivaltime = customer[0];
            int preptime = customer[1];
            if(currenttime < arrivaltime){
                currenttime = arrivaltime;
            }
            int waittime = currenttime + preptime - arrivaltime;
            time = time + waittime;

            currenttime = currenttime + preptime;
        }
        double avgtime = time / customers.length;
        return avgtime;
    }
}