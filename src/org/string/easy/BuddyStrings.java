package org.string.easy;

import java.util.HashMap;
import java.util.Map;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() == B.length() && A.length() > 1){
            Map<Character,Integer> map = new HashMap<>();
            char[] AArray = A.toCharArray();
            char[] BArray = B.toCharArray();
            int sameCount = 0;
            int diffCount = 0;
            int[]  diffIndex = new int[2];
            for (int i = 0; i < AArray.length; i++){
                if (AArray[i] != BArray[i]){
                    if (diffCount < 2 )
                        diffIndex[diffCount] = i;
                    diffCount++;
                }else {
                    sameCount++;
                    if (map.containsKey(AArray[i])){
                        map.put(AArray[i],map.get(AArray[i])+1);
                    }else {
                        map.put(AArray[i],1);
                    }
                }
            }
            if (sameCount == A.length()){
                for (Integer value:map.values()) {
                    System.out.println(value);
                    if (value > 1)
                        return true;
                }
            }else {
                if ((diffCount == 2 && ((AArray[diffIndex[0]] == BArray[diffIndex[1]]) && (AArray[diffIndex[1]] == BArray[diffIndex[0]]))))
                    return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String A = "abab";
        String B = "abab";
        boolean rs = new BuddyStrings().buddyStrings(A,B);
        System.out.println(rs);
    }
}
