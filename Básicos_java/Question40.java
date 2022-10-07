package exerciseJava;
import java.util.Scanner;

public class Question40 {
  public static void main(String[] args) {
    int x, y, z;

    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número inteiro");
    x = input.nextInt();
    System.out.println("Digite outro número inteiro");
    y = input.nextInt();
    System.out.println("Digite so mais um número inteiro");
    z = input.nextInt();

    boolean triangulo = isTriangulo(x, y, z);

    if(triangulo){
      if ((x == y) && (x == z)) {
        System.out.println("Triangulo Equilátero");
      }
      if (((x == y) && (x != z)) || ((x == z) && (x != y)) || ((y == z) && (y != x))) {
        System.out.println("Triangulo Isósceles");
      }
      if ((x != y) && (x != z) && (y != z)) {
        System.out.println("Triangulo Escaleno");
      }
    }else{
        System.out.println("Não é um triangulo");
    }

    input.close();

	}

  public static boolean isTriangulo(int x, int y, int z) {
    if((x < y + z) && (y < x + z) && (z < y + x)){
      return true;
    }else{
      return false;
    }
  }
  
}