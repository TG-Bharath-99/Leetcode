class Solution {
public:
    void reverseString(vector<char>& s) {
        vector<char>str;
        for(int i=s.size()-1;i>=0;i--){
            str.push_back(s[i]);
        }
        s=str;
    }
};