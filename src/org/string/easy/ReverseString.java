package org.string.easy;

public class ReverseString {
    public String reverseString(String s) {
        char[] charArr = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = charArr.length - 1; i >= 0; i--) {
            result.append(charArr[i]);
        }
        return  result.toString();
    }

    public static void main(String[] args) {
        String rs = new ReverseString().reverseString("hello");
        System.out.println(rs);
    }
}
