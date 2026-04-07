class Solution{
    public boolean check(int []nums,int m,int mid){
        int prev=nums[0];
        m--;
        for(int i=1;i<nums.length;i++){
            if(mid<=nums[i]-prev){
                prev=nums[i];
                m--;
            }
            if(m==0){
                return true;
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m){
        Arrays.sort(position);
        int low=1;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i:position){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        int high=max-min;
        while(low<high){
            int mid=(low+high+1)/2;
            if(check(position,m,mid)){
                low=mid;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}