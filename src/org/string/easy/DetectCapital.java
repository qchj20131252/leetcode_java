package org.string.easy;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.matches("\\p{Upper}?\\p{Upper}+|\\p{Upper}?\\p{Lower}+"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        boolean rs = new DetectCapital().detectCapitalUse("");
        System.out.println(rs);
    }
}
