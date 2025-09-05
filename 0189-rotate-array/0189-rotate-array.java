class Solution {
    public void rotate(int[] arr, int k) {
     k = k%arr.length;
     swapArray(arr,0,arr.length-k-1);
     swapArray(arr,arr.length-k,arr.length-1);
     swapArray(arr,0,arr.length-1);
    }
    public static void swapArray(int arr[],int i , int j){
        

        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}