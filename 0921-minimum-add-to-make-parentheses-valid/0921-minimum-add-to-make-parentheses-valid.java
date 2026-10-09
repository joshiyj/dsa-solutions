class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int voilations = 0;

        for(char ch: s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            } else {
                if(st.isEmpty()){
                    voilations++;
                } else {
                    st.pop();
                }
            }
        }

        return voilations + st.size();
    }
}