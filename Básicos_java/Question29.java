package exerciseJava;
import java.util.Scanner;

public class Question29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int I = 0, J = 7;
        int i = 1;
        do {
            if (J < 5) {
                J = 7;
            }
            if (i >= 1 && i <= 3) {
                I = 1;
                System.out.println("I=" + I + " J=" + J--);
            } else

            if (i >= 4 && i <= 6) {
                I = 3;
                System.out.println("I=" + I + " J=" + J--);
            } else

            if (i >= 7 && i <= 9) {
                I = 9;
                System.out.println("I=" + I + " J=" + J--);
            }

            i++;
        } while (i <= 9);

        sc.close();

    }
}
