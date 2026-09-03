class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=nums1[0];
        boolean allEven=true;
        for(int i : nums1){
            min=Math.min(min,i);
            if(i%2!=0){
                allEven=false;
            }
        }
        return min%2!=0 || min%2==0 || allEven;
    }
}