class Solution{
    public int lenLongestFibSubseq(int[] arr){
        Set<Integer>set=new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int c=0;
        int ans=0;
        int f=0;
        int s=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                f=arr[i];
                s=arr[j];
                c=0;
                int t=f+s;
                while(set.contains(t)){
                    c++;
                    ans=Math.max(ans,c);
                    f=s;
                    s=t;
                    t=f+s;
                }
            }
        }
        return (ans==0)?0:ans+2;
    }
}