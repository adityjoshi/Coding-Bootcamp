/*
Set mismatch
https://leetcode.com/problems/set-mismatch/
 */
import java.util.Arrays;

public class setMismatch {
    public static void main(String[] args) {
        int [] num = {4,3,1,1};
        System.out.println(Arrays.toString(findErrorNums(num)));
    }
    static int[] findErrorNums(int[] num) {
        int i =0;
        while(i< num.length) {
            int correct = num[i]-1;
            if(num[i]!=num[correct]) {
                swap(num,i,correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < num.length; index++) {
            if(num[index]!=index+1) {
                return new int[] {num[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int [] num,int first ,int second) {
        int temp = num[first];
        num[first]=num[second];
        num[second]=temp;
    }
}



