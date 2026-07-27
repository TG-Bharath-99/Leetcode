class Solution {
    public int maxProduct(int[] nums) {
        int f=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
        for(int i : nums){
            if(i>=f){
                s=f;
                f=i;
            }
            else if(i>s){
                s=i;
            }
        }
        return (f-1)*(s-1);
    }
}