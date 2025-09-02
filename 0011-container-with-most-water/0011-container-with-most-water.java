class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int j = n - 1;
        int area = 0;
        int maxarea = 0;

        while(i < j){
            int length = Math.min(height[i] , height[j]);
            int breadth = j - i;
            area = length * breadth;
            maxarea = Math.max(area , maxarea);
            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxarea;
    }
}