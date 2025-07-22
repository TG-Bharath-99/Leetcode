class Solution {
public:
    int thirdMax(vector<int>& nums) {
        map<int,int>m;
        for(int i=0;i<nums.size();i++){
            m[nums[i]]++;
        }
        vector<int>v;
        for(auto it:m){
            v.push_back(it.first);
        }
        sort(v.begin(),v.end(),greater<int>());
        int n=v.size();
        if(n<3){
            return v[0];
        }
        return v[2];
    }
};