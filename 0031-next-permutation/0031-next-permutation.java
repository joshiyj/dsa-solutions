class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-1;

        while(i>0 && nums[i]<=nums[i-1]){
            i--;
        }
        if(i==0){
            Arrays.sort(nums);
            return;
        }
        for(int j=nums.length-1; j>=i; j--){
            if(nums[j]>nums[i-1]){
                int temp = nums[j];
                nums[j] = nums[i-1];
                nums[i-1] = temp;
                break;
            }
        }
        Arrays.sort(nums,i,nums.length);
    }
}