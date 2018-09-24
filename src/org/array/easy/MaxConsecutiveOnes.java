package org.array.easy;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                temp++;
                if (maxCount < temp){
                    maxCount = temp;
                }
            }else {
                temp = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int maxCount = new MaxConsecutiveOnes().findMaxConsecutiveOnes(nums);
        System.out.println(maxCount);
    }

}
