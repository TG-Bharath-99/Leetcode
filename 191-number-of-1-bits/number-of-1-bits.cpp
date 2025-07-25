class Solution {
public:
    int hammingWeight(int n) {
        if(n==0){
            return 0;
        }
        vector<int>binary(32);
        int i=0;
        while(n>0){
            binary[i]=n%2;
            n/=2;
            i++;
        }
        int count=0;
        for(auto i:binary){
            if(i==1){
                count++;
            }
        }
        return count;
    }
};