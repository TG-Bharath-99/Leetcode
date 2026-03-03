class Solution{
    public int minEatingSpeed(int[] piles, int h){
        int left=1;
        int right=0;
        for(int i:piles){
            right=Math.max(right,i);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            int hours=totalHours(piles,mid);
            if(hours<=h){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    int totalHours(int []arr,int k){
        int hours=0;
        for(int i : arr){
            hours+=(i+k-1)/k;
        }
        return hours;
    }
}