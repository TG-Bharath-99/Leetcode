class Solution {
    public int[] twoSum(int[] num, int target) {
        int i=0,j=num.length-1;
        int []arr=new int[2];
        while(i<j){
            int sum=num[i]+num[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }
            if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{0};
    }
}