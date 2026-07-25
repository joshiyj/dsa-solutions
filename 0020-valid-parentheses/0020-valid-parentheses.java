class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            } else {
                if(st.isEmpty() || !isValid(st.peek(),ch)){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
    public static boolean isValid(char open, char close){
        if(open=='(' && close==')' ||
           open=='{' && close=='}' ||
           open=='[' && close==']') return true;
        
        return false;
    }
}