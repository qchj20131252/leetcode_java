package org.array.easy;

import java.util.Arrays;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        int rs = new ArrayPartitionI().arrayPairSum(nums);
        System.out.println(rs);
    }
}
