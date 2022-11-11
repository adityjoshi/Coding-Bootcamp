public class searching {
    public static void main(String[] args) {
        int [] arr = {2,4,5,7};
        int target = 6;
        System.out.println(tr(arr,target));
    }
    static int tr(int [] arr , int target ) {
        int start = 0; int end = arr.length;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]<target){
                start = mid+1 ;
            } else if(arr[mid]>target){
                end=mid-1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
