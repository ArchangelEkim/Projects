import java.util.InputMismatchException;
import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        int n;
        Scanner console = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("How many discs in the Hanoi pile?");
                n = console.nextInt();
                console.close();
                break;
            }
            catch (InputMismatchException exception) {
                System.err.println("Please input an integer greater than zero.");
            }
        }

        hanoiSolve(n, "A", "B", "C");
    }

    public static void move(String f, String t) {
        System.out.println(String.format("Move disc from %1$s to %2$s!", f, t));
    }

    public static void moveVia(String f, String v, String t) {
        move(f, v);
        move(v, t);
    }

    public static void hanoiSolve(int n, String f, String v, String t) {
        if (n != 0) {
            hanoiSolve(n-1, f, t, v);
            move(f,t);
            hanoiSolve(n-1, v, f, t);
        }
    }
}