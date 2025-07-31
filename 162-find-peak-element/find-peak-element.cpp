class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        unordered_map<int,int>mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]=i;
        }
        sort(nums.begin(),nums.end(),greater<int>());
        return mp[nums[0]];
    }
};