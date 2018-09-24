package org.array.easy;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++){
            int count = 1;
            while(count < matrix.length && i+count < matrix[0].length){
                if (matrix[0][i] != matrix[0][i+count]){
                    return false;
                }
                count++;
            }
        }

        for (int i = 0; i < matrix.length; i++){
            int count = 1;
            while(count < matrix[0].length && i+count < matrix.length){
                if (matrix[i][0] != matrix[i+count][0]){
                    return false;
                }
                count++;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2},{2,2}};
        boolean flag = new ToeplitzMatrix().isToeplitzMatrix(matrix);
        System.out.println(flag);
    }
}
