class Solution {
public:
    string reverseVowels(string s) {
        vector<char>v;
        for(auto i:s){
            if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U'||i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
            v.push_back(i);
        }
        string str="";
        int k=v.size()-1;;
        for(int i=0;i<s.size();i++){
            if(s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'||s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
                str+=v[k--];
            }else{
                str+=s[i];
            }
        }
        return str;
    }
};