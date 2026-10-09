class Solution {
    public int minAddToMakeValid(String s) {
        int br = 0;
        int voilations = 0;

        for(char ch: s.toCharArray()){
            if(ch=='('){
                br++;
            } else {
                if(br==0){
                    voilations++;
                } else {
                    br--;
                }
            }
        }

        return voilations + br;
    }
}