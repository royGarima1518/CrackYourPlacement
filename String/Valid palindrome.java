class Solution {
    private void setValues(String s)
    {
        HashMap<Character,Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
            {
                st.push(c);
            }
            else if(!st.empty() && ((c == '}' &&  st.peek() == '{' ) 
            ||   (c == ')'  &&  st.peek() == '('  ) 
            ||  (c == ']'  &&  st.peek() == '[' )))
            {
                st.pop();
            }
            else{
                st.push(c);
            }

        } 

        return st.isEmpty();
    }
}
