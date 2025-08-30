class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        int j = 0; 

        for (int i = 0; i < n && j < n; i++) {
            if (arr[i] == 0) {
                newArr[j] = 0;
                if (j + 1 < n) {   
                    newArr[j + 1] = 0;
                }
                j += 2;
            } else {
                newArr[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = newArr[i];
        }
    }
}
