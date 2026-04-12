class Solution{
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int m=nums1.length;
        int n=nums2.length;
        int low=0,high=m;
        while(low<=high){
            int cutA=low+(high-low)/2;
            int cutB=(m+n+1)/2-cutA;
            int ALeft=(cutA==0)?Integer.MIN_VALUE:nums1[cutA-1];
            int ARight=(cutA==m)?Integer.MAX_VALUE:nums1[cutA];
            int BLeft=(cutB==0)?Integer.MIN_VALUE:nums2[cutB-1];
            int BRight=(cutB==n)?Integer.MAX_VALUE:nums2[cutB];
            if(ALeft<=BRight && BLeft<=ARight){
                if((m+n)%2==1){
                    return Math.max(ALeft,BLeft);
                }
                return (Math.max(ALeft,BLeft)+Math.min(BRight,ARight))/2.0;
            }
            else if(ALeft>BRight){
                high=cutA-1;
            }
            else{
                low=cutA+1;
            }
        }
        return 0.0;
    }
}