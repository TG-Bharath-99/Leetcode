class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count=0;
        for(int i:nums){
            String s=Integer.toBinaryString(i);
            if(s.charAt(s.length()-1)=='0') count++;
        }
        return count>=2;
    }
}