package exerciseJava;
import java.util.Scanner;

public class Question50 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Quantidade de andar: ");
    int position = input.nextInt();
    int qntd = position;

    for (int i = 0; i <= position; i++) {
      String n = Integer.toString(i);
      if (n.contains("13") || n.contains("4")) {
        qntd++;
      }

      System.out.println(qntd + " - " + i);
    }
    if (Integer.toString(qntd).contains("13")) {
      qntd++;
    }
    if (Integer.toString(qntd).contains("4")) {
      qntd++;
    }
    System.out.println(qntd);

    input.close();

  }

}