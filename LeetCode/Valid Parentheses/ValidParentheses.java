class ValidParentheses {
    public boolean isValid(String s) {
        
        Stack<Character> strStack = new Stack<>();
        char brac;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                strStack.push(s.charAt(i));
            }
            else if(strStack.empty()){
                // System.out.println("line 11");
                return false;
            }
            else{
                brac = strStack.pop();
                if((brac =='(' && s.charAt(i) != ')') || ((brac == '[' || brac == '{') && s.charAt(i) != brac+2)) {
                    // System.out.println("line 17");
                    return false;
                }
                else continue;
            }
        }
        if(!strStack.empty()){
            return false;
        }
        return true;
    }
}
