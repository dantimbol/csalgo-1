
import java.util.Scanner;
public class Fibonacci {

    static int arr[][] = new int[100][100];
    static int x;
    static int ctr = 2, j = 1, i = 0;

    public static void main(String[] args) {
        Scanner patricia = new Scanner(System.in);
        System.out.print("Enter Number:");
        x = patricia.nextInt();
        arr[0][0] = 1;
        arr[1][0] = 1;
        arr[1][1] = 1;
        rec();
        rec3();
    }

    public static void rec() {
        if (ctr < x) {
            j = 1;
            arr[ctr][0] = 1;
            rec2();
            arr[ctr][ctr] = 1;
            ctr++;
            rec();
        }
    }

    public static void rec2() {
        arr[ctr][j] = arr[ctr - 1][j - 1] + arr[ctr - 1][j];
        j++;
        if (j < ctr) {
            rec2();
        }
    }

    public static void rec3() {

        System.out.print(arr[x - 1][i] + " ");
        i++;
        if (i < x) {
            rec3();
        }
    }
}
