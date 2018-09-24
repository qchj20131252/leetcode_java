package org.string.easy;

public class ToLowerCase {
    public String toLowerCase(String str){
        char[] charArray = str.toCharArray();
        for (int i = 0;i < charArray.length;i++){
            if (charArray[i] >= 65 && charArray[i] <= 90){
                charArray[i] += 32;
            }
        }
        String result = String.copyValueOf(charArray);
        return result;
    }

    public static void main(String[] args) {
        String rs = new ToLowerCase().toLowerCase("Hello");
        System.out.println(rs);
    }

}
