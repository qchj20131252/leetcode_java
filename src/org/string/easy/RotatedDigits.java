package org.string.easy;

public class RotatedDigits {
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1;i <= N;i++){
            String str = String.valueOf(i);
            if (!str.contains("3")&&!str.contains("4")&&!str.contains("7")){
                char[] charArr = str.toCharArray();
                StringBuilder sb = new StringBuilder();
                for (int j = 0;j < charArr.length;j++){
                    switch (charArr[j]){
                        case '0': case '1': case '8':
                            sb.append(charArr[j]);break;
                        case '2':sb.append('5');break;
                        case '5':sb.append('2');break;
                        case '6':sb.append('9');break;
                        case '9':sb.append('6');break;
                    }
                }
                if (!str.equals(sb.toString())){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int rs = new RotatedDigits().rotatedDigits(857);
        System.out.println(rs);
    }
}
