package exerciseJava;
import java.util.Scanner;

public class Question37 {
  public static void main(String[] args) {

    String nome, escolha, nome1, escolha1;
    int x, y, soma;
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um nome e em seguida se e: par ou impar: ");
    nome = input.nextLine();
    escolha = input.nextLine();

    System.out.print("Digite o número desejado: ");
    x = input.nextInt();
    input.nextLine();

    System.out.print("Digite um nome e em seguida se e: par ou impar: ");
    nome1 = input.nextLine();
    escolha1 = input.nextLine();

    System.out.print("Digite o número desejado: ");
    y = input.nextInt();

    soma = x + y;

    if (soma % 2 == 0 && escolha.equals("par")) {
      System.out.println(nome);
    } else if (!(soma % 2 == 0) && escolha.equals("impar")) {
      System.out.println(nome);
    } else if ((soma % 2 == 0) && escolha1.equals("par")) {
      System.out.println(nome1);
    } else if (!(soma % 2 == 0) && escolha1.equals("impar")) {
      System.out.println(nome1);
    }

    input.close();
  }
}