class Solution{
    public int countRangeSum(int[] nums, int lower, int upper){
        long []prefix=new long[nums.length+1];
        prefix[0]=0;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        return MergeSort(prefix,0,prefix.length-1,lower,upper);
    }
    int MergeSort(long []prefix,int low,int high,int lower,int upper){
        if(low>=high){
            return 0;
        }
        int count=0;
        int mid=(low+high)/2;
        count+=MergeSort(prefix,low,mid,lower,upper);
        count+=MergeSort(prefix,mid+1,high,lower,upper);
        int k=low,l=low;
        for (int j=mid+1;j<=high;j++) {
            while (k<=mid && prefix[k]<prefix[j]-upper) k++;
            while (l<=mid && prefix[l]<=prefix[j]-lower) l++;
            count+=(l-k);
        }
        int i=low,j=mid+1;
        long []temp=new long[high-low+1];
        int x=0;
        while(i<=mid && j<=high){
            if(prefix[i]<prefix[j]){
                temp[x++]=prefix[i++];
            }
            else{
                temp[x++]=prefix[j++];
            }
        }
        while(i<=mid){
            temp[x++]=prefix[i++];
        }
        while(j<=high){
            temp[x++]=prefix[j++];
        }
        for(int s=0;s<temp.length;s++){
            prefix[low+s]=temp[s];
        }
        return count;
    }
}