class Solution{
    boolean check(int []arr,int h,int mid){
        int hours=0;
        for(int i : arr){
            if(i<=mid){
                hours++;
            }
            else{
                hours+=(i/mid);
                if(i%mid!=0){
                    hours++;
                }
            }
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h){
        int low=1;
        int high=0;
        for(int i : piles){
            high=Math.max(high,i);
        }
        while(low<high){
            int mid=low+(high-low)/2;
            if(check(piles,h,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}