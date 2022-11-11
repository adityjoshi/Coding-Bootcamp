import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int [] numbers = {1,2,3,4,5};
                int findnumber = 4;
                boolean isInArray = false ;
                for(int element: numbers) {
                    if(findnumber == element) {
                        isInArray = true;
                        break;
                    }
                }
                if(isInArray) {
                    System.out.println("The number is in array");
                }else {
                    System.out.println("The number is not in the array");
                }
            }
        }


