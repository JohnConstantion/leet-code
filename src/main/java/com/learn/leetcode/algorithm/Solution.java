package com.learn.leetcode.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * * <p>
 * * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * * </p>
 * * 输入：nums = [2,7,11,15], target = 9
 * * 输出：[0,1]
 * * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * @author johnconstantine
 */
public class Solution {
    /**
     * 两个for循环
     *
     * @param nums   数组
     * @param target 需要的参数
     * @return 返回的两个数
     */
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    /**
     * 使用hash算法
     *
     * @param nums   数组
     * @param target 需要的参数
     * @return 返回的两个数
     */
    public int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args) {
        Solution n = new Solution();
        int[] sum = n.twoSum(new int[]{2, 7, 11, 15}, 9);

        System.out.println(Arrays.toString(sum));
    }
}
