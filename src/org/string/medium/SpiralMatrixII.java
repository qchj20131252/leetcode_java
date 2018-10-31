package org.string.medium;

public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] array = new int[n][n];
        int upLimit = 1;
        int leftLimit = 0;
        int downLimit = n - 1;
        int rightLimit = n - 1;
        int r = 0;
        int c = 0;
        char direction = 'R';

        for (int i = 1; i <= n*n; i++){
            array[r][c] = i;
            switch (direction){
                case 'R':if (c < rightLimit){
                    c++;
                }else{
                    r++;
                    direction = 'D';
                    rightLimit--;
                }
                break;
                case  'D':if (r < downLimit){
                    r++;
                }else{
                    direction = 'L';
                    downLimit--;
                    c--;
                }
                break;
                case 'L':if (c > leftLimit){
                    c--;
                }else{
                    direction = 'U';
                    leftLimit++;
                    r--;
                }
                break;
                case 'U':if (r > upLimit){
                    r--;
                }else{
                    direction = 'R';
                    upLimit++;
                    c++;
                }
                break;
                default:break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] rs = new SpiralMatrixII().generateMatrix(n);
        for (int k = 0; k < rs.length; k++){
            for (int j = 0; j < rs[0].length; j++){
                System.out.print(rs[k][j]+"\t");
            }
            System.out.println();
        }
    }
}
