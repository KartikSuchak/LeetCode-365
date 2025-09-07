class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int i=0;
        int j=n-1;
        int value = 1;

        if(n == 1){
            return result;
        }

        while (i < j) {
            result[i] = value;
            result[j] = -value;
            i++;
            j--;
            value++;
        }
        return result;
    }
}