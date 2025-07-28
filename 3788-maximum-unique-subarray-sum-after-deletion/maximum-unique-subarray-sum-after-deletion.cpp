class Solution {
public:
    int maxSum(vector<int>& nums) {
        unordered_map<int,int>mp;
        int sum=0,maxsum=nums[0];
        for(auto i:nums){
            if(mp.find(i)==mp.end()){
                mp[i]++;
                sum+=i;
                if(sum>i){
                    maxsum=max(maxsum,sum);
                    if(i<0){
                        sum-=i;
                    }
                }
                else{
                    maxsum=max(maxsum,i);
                    sum=i;
                }
            }
        }
        return maxsum;
    }
};