class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];
        int max = nums[0];
        int min = nums[n-1];
        for(int i=0; i<n; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            leftMax[i] = max;
        }
        for(int i=n-1; i>=0; i--){
            if(nums[i]<min){
                min = nums[i];
            }
            rightMin[i] = min;
        }

        for(int i=0; i<n; i++){
            if(leftMax[i]-rightMin[i] <= k){
                return i;
            }
        }
        
        return -1;
    }
}