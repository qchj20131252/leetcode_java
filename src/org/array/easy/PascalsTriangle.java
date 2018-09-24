package org.array.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++){
            List<Integer> nums = new ArrayList<Integer>();
            for (int j = 0; j <= i;j++){
                if (j == 0 || j == i){
                    nums.add(1);
                }else {
                    nums.add(pascalTriangle.get(i-1).get(j)+pascalTriangle.get(i-1).get(j-1));
                }
            }
            System.out.println(nums);
            pascalTriangle.add(nums);
        }
        return pascalTriangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> pascalTriangle = new PascalsTriangle().generate(numRows);
//        for (List<Integer> list:pascalTriangle) {
//            for (Integer i:list) {
//                System.out.print(i+"\t");
//            }
//            System.out.println();
//        }
    }
}
