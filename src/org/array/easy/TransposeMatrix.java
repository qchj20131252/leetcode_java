package org.array.easy;

public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int[][] rMatrix = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++){
                rMatrix[j][i] = A[i][j];
            }
        }
        return  rMatrix;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2,3},
                     {4,5,6}};

        int[][] rs = new TransposeMatrix().transpose(A);
        for (int i = 0; i < rs.length; i++){
            for (int j = 0; j <rs[0].length; j++){
                System.out.print(rs[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
