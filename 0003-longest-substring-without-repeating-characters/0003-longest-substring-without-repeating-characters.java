class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxLen = 0;
        HashMap<Character,Integer> hash = new HashMap<>();

        while(r<s.length()){
            char ch = s.charAt(r);
            if(hash.containsKey(ch) && hash.get(ch)>=l){
                l = hash.get(ch)+1;
            }
            maxLen = Math.max(maxLen,r-l+1);
            hash.put(ch,r);
            r++;
        }
        return maxLen;
    }
}