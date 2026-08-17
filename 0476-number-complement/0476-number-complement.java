class Solution {
    public int findComplement(int n) {
        int count = bitLength(n);
        int mask = (1 << count) - 1;

        int num = n ^ mask;
        return num;

    }
    
    public int bitLength(int n) {
        int count = 0;
        while (n > 0) {
            n = n >> 1;
            count++;
        }
        return count;
    }
}