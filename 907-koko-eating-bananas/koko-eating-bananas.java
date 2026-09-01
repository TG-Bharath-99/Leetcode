class Solution{
    boolean check(int []piles,int h,int mid){
        for(int i : piles){
            h-=(i+mid-1)/mid;
        }
        return h>=0;
    }
    public int minEatingSpeed(int[] piles, int h){
        int low=1,high=0;
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
        return high;
    }
}