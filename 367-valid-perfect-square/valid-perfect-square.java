class Solution{
    public boolean isPerfectSquare(int num){
        if(num<2){
            return true;
        }
        int l=1,r=num;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid==num/mid && num%mid==0){
                System.out.print(mid);
                return true;
            }
            if(mid<num/mid){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}