package LeetCode.Easy_01;

import java.util.Arrays;
//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//你可以按任意顺序返回答案。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/two-sum

public class easy_01_ac_1021 {
    public static void main(String[] args) {
        int[] a = {3,2,4};
        System.out.println(Arrays.toString(twoSum(a,6)));

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        boolean flag;
        for (int i = 0; i < nums.length-1; i++) {
            flag = false;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    flag = true;
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
            if (flag == true){
                break;
            }
        }
        return ans;
    }
}
