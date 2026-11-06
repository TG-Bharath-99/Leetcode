class Solution{
    public int thirdMax(int[] nums){
        int f=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        int t=Integer.MIN_VALUE;
        int min=0;
        for(int num : nums){
            if(num==Integer.MIN_VALUE) min++;
            if(num>f){
                t=s;
                s=f;
                f=num;
            }
            else if(num>s && num<f){
                t=s;
                s=num;
            }
            else if(num>t && num<s){
                t=num;
            }
        }
        if(nums.length<3) return f;
        if(nums.length==3){
            if(nums[0]!=nums[1] && nums[1]!=nums[2]){
                return t;
            }
            else{
                return f;
            }
        }
        if(s==Integer.MIN_VALUE) return f;
        if(min>1) return t;
        if(t!=Integer.MIN_VALUE) return t;
        return f;
    }
}