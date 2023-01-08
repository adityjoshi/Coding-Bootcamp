/*
GAS STATION PROBLEM
https://leetcode.com/problems/gas-station/description/
LEETCODE JAN CHALLENGE
 */


import java.util.Arrays;

public class gasStation {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
//        int sum1 = Arrays.stream(gas).sum();
        System.out.println(canCompleteCircuit(gas,cost));
    }
    static int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1 = Arrays.stream(gas).sum();
        int sum2 = Arrays.stream(cost).sum();
        if(sum1<sum2) {
            return -1;
        }
        int n = gas.length;
        int restFuel=0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            restFuel=restFuel +(gas[i]-cost[i]);
            if(restFuel<0) {
                start=i+1;
                restFuel=0;
            }
        }
        return start;
    }
}