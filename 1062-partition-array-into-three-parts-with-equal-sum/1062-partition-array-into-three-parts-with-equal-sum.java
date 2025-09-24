class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int m = arr.length;
        int sum = 0;
        int target = 0;
        int count = 0;

        for(int i = 0 ; i < m ; i++){
            sum = sum + arr[i];
        }
        if(sum % 3 != 0){
            return false;
        }
        int equalsum = sum / 3;
        for(int i = 0 ; i < m ; i++){
            target = target + arr[i];
            if(target == equalsum){
                target = 0;
                count ++;
                if(count == 3){
                    return true;
                }
            }
        }
        return false;
    }
}