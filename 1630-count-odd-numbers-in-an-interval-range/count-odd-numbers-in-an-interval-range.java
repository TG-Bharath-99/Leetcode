class Solution {
    public int countOdds(int low, int high) {
        if((low%2==1 && high%2==1) || (low%2==1 && high%2==0)){
            int d1=(low+1)/2;
            int d2=(high+1)/2;
            return d2+1-d1;
        }
        else if((low%2==0 && high%2==0) || (low%2==0 && high%2==1)){
            int d1=(low+1)/2;
            int d2=(high+1)/2;
            return d2-d1;
        }
        return 0;
    }
}