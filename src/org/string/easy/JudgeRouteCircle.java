package org.string.easy;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        char[] movesArr = moves.toCharArray();
        int[] result = {0,0};
        for (int i = 0; i < movesArr.length; i++){
            switch (movesArr[i]){
                case 'U':result[0] += 1;break;
                case 'D':result[0] -= 1;break;
                case 'L':result[1] += 1;break;
                case 'R':result[1] -= 1;break;
            }
        }
        if (result[0] == 0 && result[1] == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean rs =  new JudgeRouteCircle().judgeCircle("LL");
        System.out.println(rs);
    }
}
