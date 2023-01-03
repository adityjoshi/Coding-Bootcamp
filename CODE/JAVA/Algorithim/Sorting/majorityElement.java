/*
FIND THE MAJORITY ELEMENT
MOORE VOTING ALGO USE
https://leetcode.com/problems/majority-element/description/
 */


import java.util.Arrays;

public class majorityElement {
    public static void main(String[] args) {
        int [] nums = {2,3,6,1,1,1,2};
        maj(nums);
        System.out.println(maj(nums));
    }
    static int maj(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int count =0;
        int k=0;
        int max =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(count >max){
                    max=count;
                    k = nums[i];
                }
            }else{
                count =0;
            }
        }
        return k;
    }
}

/*
class Solution {
    public int majorityElement(int[] nums) {
        int elem = nums[0];
        int count = 0;

        for(int num : nums){
            if(elem == num){
                count++;
            }else{
                count--;
            }
            if(count<=0){
                elem=num;
                count=1;
            }
        }

        return elem;
    }
}

 */
