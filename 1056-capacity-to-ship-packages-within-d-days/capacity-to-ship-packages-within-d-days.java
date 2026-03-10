class Solution{
    boolean check(int []arr,int days,int mid){
        int d=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>mid){
                d++;
                sum=arr[i];
            }
        }
        return d<=days;
    }
    public int shipWithinDays(int[] weights, int days){
        int low=0;
        int high=0;
        for(int i : weights){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(check(weights,days,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}