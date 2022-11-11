import java.util.Scanner;
public class Countno {
    public static void main(String[] args) {
        int positive = 0; int negative = 0; int zero = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER 1 TO START AND 0 TO END");
        int x = in.nextInt();
        while( x == 1) {
            System.out.println("ENTER YOUR NUMBER");
            int input = in.nextInt();
            if(input > 0) {
                positive++;
            }   else if (input<0) {
                negative++;
            }   else {
                zero++;
            }
            System.out.println("ENTER 1 TO START AND 0 TO END");
            x = in.nextInt();


        }
        System.out.println("TOTAL POSITIVE NUMBERS : " + positive);
        System.out.println("TOTAL NEGATIVE NUMBERS : " + negative);
        System.out.println("TOTAL ZEROES NUMBERS : " + zero);
    }
}


