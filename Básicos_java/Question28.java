package exerciseJava;
import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1, j = 60;
        System.out.println("I=" + i + "J=" + j);
        do {
            System.out.println("I=" + (i = i + 3) + "J=" + (j = j - 5));

        } while (j > 0);
        sc.close();
    }
}
