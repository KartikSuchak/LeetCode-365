class Solution {
    public int numberOfSteps(int num) {
        int ecount=0;
        int ocount=0;
        while(num != 0){
            if(num%2 == 0){
                num = num/2;
                ecount ++ ;
            }
            else{
                num = num - 1;
                ocount ++ ;
            }
        }
        return ecount+ocount;
    }
}