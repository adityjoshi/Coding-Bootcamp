/*
Jan leetcode challenge hard problem
Asked by -> google, apple, amazon , linkedin
https://leetcode.com/problems/max-points-on-a-line/description/
 */



public class MaxPointsLine {
    public static void main(String[] args) {
        int[][] points = {{1,1} , {2,2} , {3,3}};
        System.out.println(maxPoints(points));
    }
    static int maxPoints(int[][] points) {
        int n = points.length;
        if(n <= 2) return n;
        int ans = 2;
        for(int i = 0 ;i < n; i++){
            for(int j = i+1; j < n ; j++) {
                int temp = 2;

                for(int k = j+1 ; k<n ; k++ ){

                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
                    if(x == y){
                        temp++;
                    }
                }
                if(temp > ans){
                    ans = temp;
                }
            }
        }

        return ans;
    }
}
