class Solution {
    public int[] reverseArray(int arr[]) {
        // code here
        int start = 0;
        int end = arr.length - 1;
        
        for(int i =0 ; i<arr.length/2;i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            
        }
        return arr;
    }
}
