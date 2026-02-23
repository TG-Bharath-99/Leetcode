class Solution{
    public char nextGreatestLetter(char[] letters, char target){
        char ch=letters[0];
        int low=0,high=letters.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(letters[mid]>target){
                ch=letters[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ch;
    }
}