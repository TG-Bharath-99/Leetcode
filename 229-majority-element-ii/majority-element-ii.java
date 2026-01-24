class Solution{
    public List<Integer> majorityElement(int[] nums){
        List<Integer>ans=new ArrayList<>();
        int cand1=0,cand2=0,cnt1=0,cnt2=0;
        for(int i:nums){
            if(i==cand1){
                cnt1++;
            }
            else if(i==cand2){
                cnt2++;
            }
            else if(cnt1==0){
                cand1=i;
                cnt1++;
            }
            else if(cnt2==0){
                cand2=i;
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        for(int i : nums){
            if(i==cand1) cnt1++;
            if(i==cand2) cnt2++;
        }
        if(cand1==cand2) ans.add(cand1);
        else{
        if(cnt1>nums.length/3) 
        ans.add(cand1);
        if(cnt2>nums.length/3)
        ans.add(cand2);}
        return ans;
    }
}