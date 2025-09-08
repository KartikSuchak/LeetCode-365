class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length; 
        int m = nums2.length; 
        int[] res = new int[Math.min(m,n)]; 
        int index = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j=0;

        while(i<n && j<m){
            if(nums1[i] == nums2[j]){
                if(index == 0 || res[index-1] != nums1[i]) {
                    res[index] = nums1[i];
                    index++;
                }
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }   
        }
        return Arrays.copyOf(res, index); 
    }
}
