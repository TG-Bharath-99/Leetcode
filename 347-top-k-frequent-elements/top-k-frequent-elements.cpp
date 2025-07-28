class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k){
        unordered_map<int,int>mp;
        vector<pair<int,int>>v;
        vector<int>result;
        for(auto i:nums){
            mp[i]++;
        }
        for(auto it:mp){
            v.push_back({it.first,it.second});
        }
        sort(v.begin(),v.end(),[](auto &a,auto &b){
            return a.second<b.second;
        });
        int i=0;
        for(auto it=v.rbegin();it!=v.rend();it++){
            if(i<k){
                result.push_back(it->first);
                i++;
            }
        }
        return result;
    }
};