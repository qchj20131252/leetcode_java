package org.array.easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){

            if (nums[i] == 0){
                count++;
            }else {
                if (i - count  >= 0)
                    nums[i - count] = nums[i];
            }
        }
        for (int i = 0; i < count; i++){
            nums[nums.length-1-i] = 0;
        }

        for (int i:nums) {
            System.out.print(i);
            System.out.print("\t");
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0};
        new MoveZeroes().moveZeroes(nums);
    }
}
