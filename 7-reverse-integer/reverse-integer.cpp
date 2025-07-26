class Solution {
public:
    int reverse(int x) {
        long long num=0;
        if(x<0){
        long long n=abs((long long)x);
        while(n>0){
            int r=n%10;
            num=num*10+r;
            n/=10;
        }
        num=-num;
        if(num<INT_MIN){
        return 0;}
        return (int)num;
        }
    else{
        while(x>0){
            int r=x%10;
            num=num*10+r;
            x/=10;
        }
    if(num>INT_MAX || num<INT_MIN){
        return 0;
    }
    return (int)num;
    }
    return 0;
}
};