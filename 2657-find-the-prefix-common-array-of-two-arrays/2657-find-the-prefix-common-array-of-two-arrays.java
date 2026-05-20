class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int m = A.length;
        int[] freq = new int[m + 1];
        int[] res = new int[m];
        int cnt = 0;

        for(int i = 0; i < m; i++) {
            freq[A[i]]++;
            if(freq[A[i]] == 2) {
                cnt++;
            }
            freq[B[i]]++;
            if(freq[B[i]] == 2) {
                cnt++;
            }
            res[i] = cnt;
        }
        return res;
    }
}