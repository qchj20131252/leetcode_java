package org.array.easy;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int[] order_nums = new int[nums.length];

        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int result = new MissingNumber().missingNumber(nums);
        System.out.println(result);
    }

}
