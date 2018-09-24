package org.array.easy;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val)
                count++;
            else
                nums[i - count] = nums[i];
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int len = new RemoveElement().removeElement(nums,3);
        System.out.println(len);
    }
}
