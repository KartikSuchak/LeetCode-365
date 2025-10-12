class Solution {
    public int mySqrt(int x) {
        int i = 1;
        int j = x;
        if(x == 0){
            return 0;
        }

        while(i <= j){
            int mid = i + (j - i) / 2;
            if(mid == x / mid){
                return mid;
            }
            else if(mid < x / mid){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        return j;
    }
}