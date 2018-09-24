package org.string.easy;

import java.util.HashMap;

public class RomantoInteger {
    public int romanToInt(String s) {
        int result = 0;
        char[] charArr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (int i = 0; i < charArr.length; i++){
            if (i == charArr.length - 1){
                result += map.get(charArr[i]);
            }else {
                if (map.get(charArr[i]) < map.get(charArr[i+1])){
                    result -= map.get(charArr[i]);
                }else {
                    result += map.get(charArr[i]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int rs = new RomantoInteger().romanToInt("MCMXCIV");
        System.out.println(rs);
    }
}
