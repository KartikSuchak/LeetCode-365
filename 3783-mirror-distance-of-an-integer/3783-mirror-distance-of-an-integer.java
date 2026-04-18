class Solution {
    public int reverseNum(int x){
        int rev = 0;
        while(x > 0){
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }
    
    public int mirrorDistance(int n) {
        return Math.abs(n - reverseNum(n));
    }
}