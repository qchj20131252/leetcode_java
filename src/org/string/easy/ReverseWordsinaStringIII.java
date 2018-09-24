package org.string.easy;

public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0;i < strs.length;i++) {
            StringBuilder r = new StringBuilder();
            char[] chars = strs[i].toCharArray();
            for (int j = chars.length - 1;j >= 0; j--) {
                r.append(chars[j]);
            }
            if (i == strs.length - 1){
                result.append(r.toString());
            }else {
                result.append(r.toString() + " ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String rs = new ReverseWordsinaStringIII().reverseWords("Let's take LeetCode contest");
        System.out.println(rs);
    }
}
