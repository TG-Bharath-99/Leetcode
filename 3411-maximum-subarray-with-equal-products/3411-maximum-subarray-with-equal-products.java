class Solution{
    int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int maxLength(int[] nums){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int g=-1;
            int l=-1;
            int p=nums[i];
            for(int j=i+1;j<nums.length;j++){
                p*=nums[j];
                if(g==-1 && l==-1){
                    g=gcd(nums[i],nums[j]);
                    l=(nums[i]*nums[j])/g;
                }
                else{
                    g=gcd(g,nums[j]);
                    l=(l*nums[j])/gcd(l,nums[j]);
                }
                if(p==l*g){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}