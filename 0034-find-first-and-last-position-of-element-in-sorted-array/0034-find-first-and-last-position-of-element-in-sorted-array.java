class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int low = lowerBound(nums,target);
        int high = upperBound(nums,target);
        return new int[]{low,high};
    }
    public static int lowerBound(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                idx = mid;
                high = mid-1;
            } else if(arr[mid]<target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return idx;
    }
    public static int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int idx = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                idx = mid;
                low = mid+1;
            } else if(arr[mid]<target){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }

        return idx;
    }
}