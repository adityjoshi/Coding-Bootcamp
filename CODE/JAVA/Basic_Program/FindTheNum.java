public class FindTheNum {
    public static void main(String[] args) {
        int [] arr = {2,3,4,55,7,8,9};
        int target = 5;
        System.out.println(num(arr,target));
    }
    static int num(int [] arr , int target) {
        for(int i = 0; i<arr.length; i++) {
            if(target==arr[i]) {
                return target;
            }
        }
        return -1;
    }
}
