class Solution{
    public int mySqrt(int x){
        int l=1,h=x;
        int ans=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid==x/mid){
                return mid;
            }
            else if(mid<x/mid){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return ans;
    }
}