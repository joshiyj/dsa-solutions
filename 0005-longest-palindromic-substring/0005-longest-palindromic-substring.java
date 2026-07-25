class Solution {
    public String longestPalindrome(String s) {
        int maxlen = 1;
        String pal = s.substring(0,1);

        for(int i=0; i<s.length(); i++){
            int len = 1;
            int l = i-1;
            int r = i+1;

            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                len+=2;
                l--;
                r++;
            }
            if(len>maxlen){
                pal = s.substring(l+1,r);
                maxlen = pal.length();
            }
        }

        for(int i=0; i<s.length()-1; i++){
            int len = 0;
            int l = i;
            int r = i+1;

            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                len+=2;
                l--;
                r++;
            }
            if(len>maxlen){
                pal = s.substring(l+1,r);
                maxlen = pal.length();
            }
        }

        return pal;
    }
}