/*
AMAZON INTERVIEW QUESTION
LEETCODE - https://leetcode.com/problems/find-the-duplicate-number/submissions/871140908/

 */



import java.util.Arrays;

public class duplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2,};
        cyc(nums);
        System.out.println(cyc(nums));

    }

    static int cyc(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
                } else {
                i++ ;
            }
        }
        return -1;
    }

     static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}