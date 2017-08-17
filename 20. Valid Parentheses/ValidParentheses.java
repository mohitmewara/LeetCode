public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] arr = s.toCharArray();
        for(char c:arr){
            if(stack.empty()){
                if(c == ']' || c == ')' || c == '}'){
                    return false;
                }
                stack.push(c);
                continue;
            }
            if(stack.peek() == '('){
                if(c =='}' || c == ']'){
                    return false;
                }else if(c == ')'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else if(stack.peek() == '['){
                if(c =='}' || c == ')'){
                    return false;
                }else if(c == ']'){
                    stack.pop();
                }else{
                    stack.push(c);
                }                
            }else{
                if(c ==')' || c == ']'){
                    return false;
                }else if(c == '}'){
                    stack.pop();
                }else{
                    stack.push(c);
                }                
            }

        }
        return stack.empty();
    }
}
