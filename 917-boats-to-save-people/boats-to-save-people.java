class Solution{
    public int numRescueBoats(int[] people, int limit){
        int count=0;
        Arrays.sort(people);
        int left=0,right=people.length-1;
        while(left<=right){
            int c=people[left]+people[right];
            if(c<=limit){
                count++;
                left++;
                right--;
            }
            else{
                count++;
                right--;
            }
        }
        return count;
    }
}