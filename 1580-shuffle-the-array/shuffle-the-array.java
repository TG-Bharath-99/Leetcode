class Solution{
    public int[] shuffle(int[] nums, int n){
        int []ans=new int[n*2];
        int i1=0;
        int i2=0;
        int j1=1;
        int j2=n;
        while(j2<n*2){
            ans[i1]=nums[i2];
            ans[j1]=nums[j2];
            i1+=2;
            i2++;
            j1+=2;
            j2++;
        }
        return ans;
    }
}