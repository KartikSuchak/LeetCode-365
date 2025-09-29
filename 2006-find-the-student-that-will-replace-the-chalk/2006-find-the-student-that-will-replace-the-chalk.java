class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int m = chalk.length;
        long sum = 0;

        for(int i = 0 ; i < m ; i++){
            sum = sum + chalk[i];
        }
        k = (int) (k % sum);
        for(int i = 0 ; i < m ; i++){
            if(chalk[i] > k){
                return i;
            }
            k = k - chalk[i];
        }
        return -1;
    }
}