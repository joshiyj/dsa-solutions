class Solution {
    public boolean isAnagram(String s, String t) {
        int[] chars = new int[26];

        for(char ch: s.toCharArray()){
            int idx = ch-'a';
            chars[idx]++;
        }
        for(char ch: t.toCharArray()){
            int idx = ch-'a';
            chars[idx]--;
        }
        for(int i=0; i<26; i++){
            if(chars[i]!=0) return false;
        }

        return true;
    }
}