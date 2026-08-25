class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        Map<Integer,Integer> nextgreater =new HashMap<>();
        Deque <Integer> stack=new ArrayDeque<>();
        for(int num:num2){
            while(!stack.isEmpty() && stack.peek()<num){
                nextgreater.put(stack.pop(),num);
            }
            stack.push(num);   
        }
        int[] result=new int[num1.length];
        for(int i=0;i<num1.length;i++){
            result[i]=nextgreater.getOrDefault(num1[i],-1);
        }
        return result;
    }
}