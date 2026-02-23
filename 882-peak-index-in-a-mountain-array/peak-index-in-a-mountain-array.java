class Solution{
    public int peakIndexInMountainArray(int[] arr){
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return 0;
    }
}