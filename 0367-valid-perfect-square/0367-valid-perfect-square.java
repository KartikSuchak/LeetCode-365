class Solution {
    public boolean isPerfectSquare(int num) {
        int x = (int)Math.sqrt(num);
        if(x * x == num){
            return true;
        }
        return false;
    }
}