class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxwater=Integer.MIN_VALUE;
        int i=0,j=n-1;
        while(i<j){
            maxwater=Math.max(maxwater,(Math.min(height[i],height[j])*(j-i)));
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxwater;
    }
}