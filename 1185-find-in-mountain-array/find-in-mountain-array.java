/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution{
    public int findInMountainArray(int target, MountainArray obj){
        int peak=PeakIndex(obj);
        int first=BinarySearch(obj,target,0,peak);
        if(first!=-1){
            return first;
        }
        else{
            return BinarySearch(obj,target,peak+1,obj.length()-1);
        }
    }
    static int PeakIndex(MountainArray arr){
        int start=0,end=arr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr.get(mid)>arr.get(mid+1)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    static int BinarySearch(MountainArray arr,int target,int start,int end){
        int startelement=arr.get(start);
        int endelement=arr.get(end);
        while(start<=end){
            int mid=start+(end-start)/2;
             int midval=arr.get(mid);
            if(startelement<endelement){
                if(midval==target){
                    return mid;
                }
                else if(midval>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(midval==target){
                    return mid;
                }
                else if(midval<target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}