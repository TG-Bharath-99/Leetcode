class Solution{
    void change(int []nums){
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int sum=0;
            while(x>0){
                sum+=x%10;
                x/=10;
            }
            nums[i]=sum;
        }
    }
    int []original;
    public int minSwaps(int[] nums){
        original=new int[nums.length];
        Map<Integer,Integer>index=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            original[i]=nums[i];
            index.put(nums[i],i);
        }
        change(nums);
        Map<Integer,Integer>map=new HashMap<>();
        mergeSort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++){
            map.put(original[i],index.get(original[i]));
        }
        int []values=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            values[i]=map.get(original[i]);
        }
        return nums.length-Number_of_cycles(values);
    }
    int Number_of_cycles(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1) continue;
            int x=i;
            while(arr[x]!=-1){
                int next=arr[x];
                arr[x]=-1;
                x=next;
            }
            count++;
        }
        return count;
    }
    void mergeSort(int []nums,int low,int high){
        if(low>=high) return;
        int mid=low+(high-low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    void merge(int []nums,int low,int mid,int high){
        int i=low,j=mid+1;
        int []temp=new int[high-low+1];
        int []tempextra=new int[high-low+1];
        int k=0;
        while(i<=mid && j<=high){
            if(nums[i]<nums[j] || (nums[i]==nums[j] && original[i]<original[j])){
                temp[k]=original[i];
                tempextra[k++]=nums[i++];
            }
            else{
                temp[k]=original[j];
                tempextra[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k]=original[i];
            tempextra[k++]=nums[i++];
        }
        while(j<=high){
            temp[k]=original[j];
            tempextra[k++]=nums[j++];
        }
        for(int x=0;x<k;x++){
            original[low+x]=temp[x];
            nums[low+x]=tempextra[x];
        }
    }
}