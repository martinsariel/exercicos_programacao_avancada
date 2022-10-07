package exerciseJava;
import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print("Ho ");
        }
        System.out.println("Ho!");

        sc.close();
    }
}
