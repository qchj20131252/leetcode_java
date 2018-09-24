package org.string.easy;

public class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        char[] charArr = s.toCharArray();
        int absentCount = 0;
        char pre_element = ' ';
        int lateCount = 0;
        int temp = 0;
        for (int i = 0; i < charArr.length; i++){
            if (charArr[i] == 'A'){
                absentCount++;
            }else if (charArr[i] == 'L'){
                if (pre_element == charArr[i]){
                    temp++;
                }else {
                    temp = 1;
                }
                if (lateCount < temp)
                    lateCount = temp;
            }
            pre_element = charArr[i];
        }
        if (absentCount <= 1 && lateCount <= 2){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "LALL";
        boolean rs = new StudentAttendanceRecordI().checkRecord(s);
        System.out.println(rs);
    }
}
