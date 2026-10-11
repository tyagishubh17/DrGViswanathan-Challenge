class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char a = '('; char b = ')'; char c = '{'; char d = '}'; char e = '['; char f = ']';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == a || s.charAt(i) == c || s.charAt(i) == e){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == b || s.charAt(i) == d || s.charAt(i) == f){
                if(stack.isEmpty()){
                    return false;
                } char temp = stack.peek();
                if ((s.charAt(i) == b && temp == a) || 
                    (s.charAt(i) == d && temp == c) || 
                    (s.charAt(i) == f && temp == e)) 
                    {stack.pop();}
                else{return false;}            
            }        
        } 
        return stack.isEmpty();
    }
}
