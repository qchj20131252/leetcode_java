package org.string.easy;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] sArr = S.toCharArray();
        for (int i = 0; i < sArr.length; i++){
            if (J.contains(String.valueOf(sArr[i]))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        int rs = new JewelsAndStones().numJewelsInStones(J,S);
        System.out.println(rs);
    }
}
