import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int button = in.nextInt();
        switch(button) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }

    }
}

/*
OTHER WAYS TO WRITE SWITCH STATEMENTS
 */
//import java.util.Scanner;
//public class Sadi {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int button = in.nextInt();
//        switch(button) {
//            case 1 : System.out.println("first floor");
//                break;
//            case 2 : System.out.println("second floor");
//                break;
//            case 3 : System.out.println("third floor");
//                break;
//            case 4 : System.out.println("fourth floor ");
//            default: System.out.println("enter valid number");
//        }
//
//
//    }
//}