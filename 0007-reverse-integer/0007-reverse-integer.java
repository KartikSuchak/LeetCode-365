class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x != 0){
            int d = x%10;
            x = x/10;
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && d >7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && d < -8)) return 0;
            reverse = reverse*10 + d;
        }
        return reverse;
    }
}