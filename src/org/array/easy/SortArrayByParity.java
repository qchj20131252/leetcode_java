package org.array.easy;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while ( i < j){
            if (A[i]%2 == 1) {
                if (A[j] % 2 == 0){
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
                j--;
            }else {
                i++;
            }

        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = {1,0,3};
        int[] rs = new SortArrayByParity().sortArrayByParity(A);
        for (int k=0;k<A.length;k++){
            System.out.print(A[k]+"\t");
        }
        System.out.println();
        System.out.println(0%2);
    }
}
