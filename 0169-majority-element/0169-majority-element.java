class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int last = nums[0];

        for(int i=0; i<nums.length; i++){
            if(cnt==0) last = nums[i];
            if(nums[i]==last){
                cnt++;
            } else {
                cnt--;
            }
        }

        return last;
    }
}