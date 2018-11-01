package org.string.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] sArray = s.toLowerCase().toCharArray();
        int startPosition = 0;
        boolean startFlag = false;
        int endPosition = sArray.length - 1;
        boolean endFlag = false;
        while (startPosition < sArray.length){
            if ((sArray[startPosition] >= 'a' && sArray[startPosition] <= 'z') || (sArray[startPosition] >= '0' && sArray[startPosition] <= '9')){
                startFlag = true;
            }else {
                startPosition++;
                startFlag = false;
                continue;
            }
            if ((sArray[endPosition] >= 'a' && sArray[endPosition] <= 'z') || (sArray[endPosition] >= '0' && sArray[endPosition] <= '9')){
                endFlag = true;
            }else {
                endPosition--;
                endFlag = false;
                continue;
            }
            if ((sArray[startPosition] != sArray[endPosition]) && (startFlag == true && endFlag == true)){
                return false;
            }
            startPosition++;
            endPosition--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "race a car";
        boolean rs = new ValidPalindrome().isPalindrome(s);
        System.out.println(rs);
    }
}
