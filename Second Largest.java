class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int FirstLargest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]>FirstLargest){
                SecondLargest = FirstLargest;
                FirstLargest = arr[i];
            }
            else if(arr[i]>SecondLargest && arr[i]!= FirstLargest){
                SecondLargest= arr[i];
            }
        }
        return (SecondLargest == Integer.MIN_VALUE) ? -1: SecondLargest;
    }
}
