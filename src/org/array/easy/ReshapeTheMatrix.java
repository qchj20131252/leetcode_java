package org.array.easy;

public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r*c != nums.length*nums[0].length){
            return nums;
        }
        int[][] rMatrix = new int[r][c];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[0].length; j++){
                int row = (i*nums[0].length + j)  / c;
                int column = (i*nums[0].length + j) % c;
                rMatrix[row][column] = nums[i][j];
            }
        }
        return rMatrix;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] rMatrix = new ReshapeTheMatrix().matrixReshape(nums,r,c);
        System.out.println(rMatrix.length);
        System.out.println(rMatrix[0].length);
        for (int i = 0; i < rMatrix.length; i++){
            for (int j = 0; j < rMatrix[0].length; j++){
                System.out.print(rMatrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
