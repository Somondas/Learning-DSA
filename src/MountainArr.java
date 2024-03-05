// link--https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class MountainArr {
    public static void main(String[] args) {
        
    }
     public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end =  arr.length -1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // -> you are in dec part of array
                // -> this my be the ans, but look at left
                // -> this is why end is != mid -1
                end = mid;
            }else{
                // -> you are in asc part of array
                //-> start = mid + 1 because we know that mid+1 element > mid element
                start = mid + 1;
            }
        }
        return start;

    }
}
