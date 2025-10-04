class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                merged[k] = nums1[i];
                k++;
                i++;
            }
            else{
                merged[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i < m){
            merged[k] = nums1[i];
            k++;
            i++;
        }
        while(j < n){
            merged[k] = nums2[j];
            k++;
            j++;
        }

        int sum = m + n;

        if(sum % 2 == 0){
            return(merged[sum / 2] + merged[sum / 2 - 1]) / 2.0;
        }
        else{
            return(merged[sum / 2]);
        }
    }
}