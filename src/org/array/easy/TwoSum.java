package org.array.easy;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target)
                    flag = true;
                result[0] = i;
                result[1] = j;
                break;
            }
            if (flag == true){
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] rs = new TwoSum().twoSum(nums,target);
        System.out.println("["+rs[0]+","+rs[1]+"]");
    }

}
