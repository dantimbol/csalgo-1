



import java.util.Scanner;

public class Factorial {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Input yo number! : ");
        number = input.nextInt();
        System.out.println("The answer is: " +summation(number));
    }

    public static int summation(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + summation(num - 1);
        }
    }
}
