package exerciseJava;
import java.util.ArrayList;

import java.util.Scanner;

public class Question44 {

  public static void main(String[] args) {
    ArrayList<Integer> pares = new ArrayList<Integer>();
    ArrayList<Integer> impares = new ArrayList<Integer>();
    ArrayList<Integer> todos = new ArrayList<Integer>();
    int numero, mediaImpar, soma = 0, diferenca;

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o : " + (i + 1) + "ª número: ");
      numero = sc.nextInt();
      if (numero % 2 == 0) {
        todos.add(numero);
        pares.add(numero);
      } else {
        todos.add(numero);
        impares.add(numero);
      }
    }

    for (int i = 0; i < impares.size(); i++) {
      soma += impares.get(i);
    }

    mediaImpar = soma / impares.size();
    todos.sort(null);
    diferenca = todos.get(todos.size() - 1) - todos.get(0);
    pares.sort(null);

    System.out.println("Média dos Impares: " + mediaImpar);
    System.out.println("Maior número PAR: " + pares.get(pares.size() - 1));
    System.out.println("Diferença: " + diferenca);

    sc.close();
  }
}
