/*
FIRST MISSING POSITIVE -> AMAZON HARD QUESTION
https://leetcode.com/problems/first-missing-positive/description/
 */


public class missingPositive {
    public static void main(String[] args) {
        int [] arr ={1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        int i =0;
        while(i<arr.length) {
            int correct = arr[i]-1;
            if( arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]) {
                swap(arr,i,correct);
            } else {
                i++;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!= j+1) {
                return j+1;
            }

        }
        return arr.length+1;
    }
    static void swap(int [] arr , int start ,int end) {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
