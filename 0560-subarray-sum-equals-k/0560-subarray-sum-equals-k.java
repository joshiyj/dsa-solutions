class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        int prefSum = 0;
        int cnt = 0;

        for(int i=0; i<nums.length; i++){
            prefSum += nums[i];
            int req = prefSum - k;
            if(hash.containsKey(req)) cnt += hash.get(req);

            hash.put(prefSum, hash.getOrDefault(prefSum, 0)+1);
        }
        return cnt;
    }
}