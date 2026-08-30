class Solution{
    public int minimumDeletions(int[] nums){
        int n=nums.length;
        int start=0;
        int max=0,min=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        int ans=0;
        if(min<=max){
            int s=min+1;
            int e=n-max;
            int maxd=max+1;
            int mind=n-min;
            ans=Math.min(Math.min(maxd,mind),(e+s));
        }
        else{
            int s=max+1;
            int e=n-min;
            int mind=min+1;
            int maxd=n-max;
            ans=Math.min(Math.min(maxd,mind),(e+s));
        }
        System.out.println(max);
        System.out.println(min);
        return ans;
    }
}