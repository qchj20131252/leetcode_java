package org.string.easy;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] sArr = s.split(" ");
        if (sArr.length != 0)
            return sArr[sArr.length - 1].length();
        return 0;
    }

    public static void main(String[] args) {
        String s = " ";
        int rs = new LengthofLastWord().lengthOfLastWord(s);
        System.out.println(rs);

    }

}
