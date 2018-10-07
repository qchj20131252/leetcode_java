package org.string.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] sArr = s.toCharArray();
        for (int i = 0; i < sArr.length; i++){
            char c = sArr[i];
            switch (c){
                case '(':
                case '[':
                case '{':stack.push(c);break;
                case ')':if (!stack.empty() && '(' == stack.peek()){
                    stack.pop();
                }else {
                    return false;
                }
                break;
                case ']':if (!stack.empty() && '[' == stack.peek()){
                    stack.pop();
                }else {
                    return false;
                }
                break;
                case '}':if (!stack.empty() && '{' == stack.peek()){
                    stack.pop();
                }else {
                    return false;
                }
                break;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "]";
        boolean rs = new ValidParentheses().isValid(s);
        System.out.println(rs);
    }


}
