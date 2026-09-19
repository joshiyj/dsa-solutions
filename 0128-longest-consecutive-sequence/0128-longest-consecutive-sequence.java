class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;

        int maxLen = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        for(int n : set){
            if(!set.contains(n-1)){
                int len = 1;
                int curr = n;

                while(set.contains(curr+1)){
                    len++;
                    curr++;
                }

                maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}