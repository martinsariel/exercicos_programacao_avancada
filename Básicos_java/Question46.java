package exerciseJava;
import java.util.Scanner;

public class Question46 {
  public static void main(String[] args) {
    int x, y, soma;

    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número inteiro: obs/ numeros apenas entre 0 e 20" );
    x = input.nextInt();
    System.out.println("Digite outro número inteiro:  obs/ numeros apenas entre 0 e 20");
    y = input.nextInt();

    if(x >= 0 && x <=20 || y >= 0 && y <=20){
      soma = fatorial(x) + fatorial(y);
      System.out.println("Valor da soma e: " + soma);
    } else {
      System.out.println("Digite apenas numeros entre 0 e 20!");
    }

    input.close();

  }

  public static int fatorial(int x) {
    int result = 1;
    for (int i = 1; i <= x; i++) {
     result = result * i;
    }
    return result;
  }
}
