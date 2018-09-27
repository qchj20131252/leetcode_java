package org.string.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        char[] magazineArray = magazine.toCharArray();
        char[] ransomNoteArray = ransomNote.toCharArray();
        for (int i = 0; i < magazineArray.length; i++){
            if (map.containsKey(magazineArray[i])){
                map.put(magazineArray[i],map.get(magazineArray[i])+1);
            }else {
                map.put(magazineArray[i],1);
            }
        }
        for (int i = 0; i < ransomNoteArray.length; i++){
            if (map.containsKey(ransomNoteArray[i]) && map.get(ransomNoteArray[i]) != 0){
                map.put(ransomNoteArray[i],map.get(ransomNoteArray[i])-1);
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "ab";
        boolean rs = new RansomNote().canConstruct(ransomNote,magazine);
        System.out.println(rs);
    }
}
