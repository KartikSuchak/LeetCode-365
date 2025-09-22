class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int m = apple.length;
        int n = capacity.length;
        int applesum = 0;
        int count = 0;

        Arrays.sort(capacity);

        for(int i = 0 ; i < m ; i++){
            applesum = applesum + apple[i];
        }

        int j = n - 1;
        while(j < n && applesum > 0){
            applesum = applesum - capacity[j];
            count++;
            j--;         
        }
        return count;
    }
}