class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        int i = 0;
        int m = operations.length;

        while(i < m){
            if(operations[i].equals("--X") || operations[i].equals("X--")){
                x = x - 1;
            }
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                x = x + 1;
            }
            i++;
        }
        return x;
    }
}