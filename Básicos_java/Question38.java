package exerciseJava;
import java.util.Scanner;

public class Question38 {
  public static void main(String[] args) {
    int x;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite um numero inteiro, veja se e primo ou não!");
    x = input.nextInt();

    if (isPrimo(x)){
      System.out.println(x +" Primo");
    } else {
      System.out.println(x +" Não e");
    }
    input.close();

  }

  public static boolean isPrimo(int x) {
    if (x <= 1) {
      return false;
    }

    for(int i =2; i < x; i++){
      if(x % i == 0){
        return false;
      }
      return true;
    }
    return false;
  }
}