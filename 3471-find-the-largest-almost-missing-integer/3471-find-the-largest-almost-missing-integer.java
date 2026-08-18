class Solution{
    public int largestInteger(int[] nums, int k){
        int ans=Integer.MIN_VALUE;
        int []freq=new int[51];
        for(int i=0;i<=nums.length-k;i++){
            boolean []seen=new boolean[51];
            for(int j=i;j<i+k;j++){
                if(!seen[nums[j]]){
                    freq[nums[j]]++;
                    seen[nums[j]]=true;
                }
            }
        }
        for(int i=0;i<51;i++){
            if(freq[i]==1) ans=Math.max(ans,i);
        }
        return (ans==Integer.MIN_VALUE)?-1:ans;
    }
}