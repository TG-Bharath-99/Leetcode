class Solution{
    boolean check(int []dist,double hour,int mid){
        double s=0;
        for(int i=0;i<dist.length-1;i++){
            s+=Math.ceil((double)dist[i]/mid);
        }
        s+=(double)dist[dist.length-1]/mid;
        return s<=hour;
    }
    public int minSpeedOnTime(int[] dist, double hour){
        int low=1;
        int high=10000000;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(dist,hour,mid)){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}