package exerciseJava;
import java.util.Scanner;

public class Question39 {
  public static void main(String[] args) {
    int x;

    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número inteiro");
    x = input.nextInt();
    for (int  i = 0; i <= 10; i++) {
        int result = x*i;
        System.out.println(x + " x " + i + " = " + result);
    }

    input.close();

	}
}