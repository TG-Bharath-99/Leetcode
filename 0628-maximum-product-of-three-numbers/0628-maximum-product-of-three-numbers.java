class Solution {
    public int maximumProduct(int[] nums) {
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        int t=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i : nums){
            if(i>f){
                t=s;
                s=f;
                f=i;
            }
            else if(i>s){
                t=s;
                s=i;
            }
            else if(i>t){
                t=i;
            }
            if(i<min1){
                min2=min1;
                min1=i;
            }
            else if(i<min2){
                min2=i;
            }
        }
        return Math.max(f*s*t,min1*min2*f);
    }
}