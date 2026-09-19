class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int elem = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]==elem){
                cnt++;
            } else {
                cnt--;
            }
            if(cnt==0){
                elem = nums[i];
                cnt = 1;
            }
        }
        return elem;
    }
}