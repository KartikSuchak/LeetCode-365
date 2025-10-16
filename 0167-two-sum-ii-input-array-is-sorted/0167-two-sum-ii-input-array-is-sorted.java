class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int m = numbers.length;
        int[] res = new int[2];
        int i = 0;
        int j = m - 1;

        while(i < j){
            if(numbers[i] + numbers[j] == target){
                res[0] = i + 1;
                res[1] = j + 1;
                break;
            }
            else if(numbers[i] + numbers[j] < target){
                i++;
            }
            else{
                j--;
            }
        } 
        return res;
    }
}