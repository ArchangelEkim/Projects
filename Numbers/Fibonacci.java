import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner console = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("How many iterations? ");
                n = console.nextInt();
                console.close();
                break;
            } 
            catch (InputMismatchException exception){
                System.err.println("Please enter a valid integer.");
                console.next();
                continue;
            }
        }

        BigInteger a = BigInteger.valueOf(0), b = BigInteger.valueOf(1), c = BigInteger.valueOf(0);
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a.add(b);
            a = b;
            b = c;
        }
    }
}