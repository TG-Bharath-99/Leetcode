class Solution{
    public int majorityElement(int[] nums){
        int ans=0;
        int c=0;
        for(int i : nums){
            if(c==0){
                c++;
                ans=i;
            }
            else if(ans==i){
                c++;
            }
            else{
                c--;
            }
        }
        return ans;
    }
}