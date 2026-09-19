class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        int maxCount = 0;

        for(int n: set){
            if(!set.contains(n-1)){
                int count = 1;
                int i=1;
                while(set.contains(n+i)){
                    count++;
                    i++;
                }
                maxCount = Math.max(count,maxCount);
            }
        }
        return maxCount;
    }
}