class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int i = 0, j = n-1;
        int leftMax = 0, rightMax = 0;
        int res = 0;
        while (i <= j) {
            if (height[i] <= height[j]) {
                if (height[i] >= leftMax) {
                    leftMax = height[i];
                } 
                else {
                    res = res + leftMax - height[i];
                }
                i++;
            } 
            else {
                if (height[j] >= rightMax) {
                    rightMax = height[j];
                } 
                else {
                    res = res + rightMax - height[j];
                }
                j--;
            }
        }
        return res;
    }
}
