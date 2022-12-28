import java.util.Arrays;

public class se {
    public static void main(String[] args) {
        int [] ar = {3,9,8,1,2};
        sel(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void sel(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length-1-i;
            int maxIndex = getMax( arr , 0 , last);

            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr ,int first , int second ) {              // int first = maxIndex , int second = last 
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
     static int getMax(int[] arr, int start, int end) {
        int max = start;
         for (int i = start; i <=end; i++) {
             if(arr[max]<arr[i]){
                 max =i;
             }
         }
         return max ;
    }
}
