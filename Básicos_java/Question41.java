package exerciseJava;
import java.util.Scanner;

public class Question41 {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Double weight, height, result;

    System.out.print("Digite sua altura: ");
    height = input.nextDouble();

    System.out.print("Digite seu peso atual: ");
    weight = input.nextDouble();

    if (height <= 1.50) {

      if (weight == 50) {
        System.out.println("Você está no peso Ideal!");
      } else if (weight > 50) {
        result = weight - 50;
        System.out.println("Emagraça: " + result + "Kg(s)");
      } else if (weight < 50) {
        result = 50 - weight;
        System.out.println("Engorde: " + result + "Kg(s)");
      }

    }

    if (height >= 1.50 && height <= 1.90) {

      if (weight == 70) {
        System.out.println("Você está no peso Ideal!");
      } else if (weight > 70) {
        result = weight - 70;
        System.out.println("Emagraça: " + result + "Kg(s)");
      } else if (weight < 70) {
        result = 70 - weight;
        System.out.println("Engorde: " + result + "Kg(s)");
      }

    }

    if (height >= 1.91) {

      if (weight == 100) {
        System.out.println("Você está no peso Ideal!");
      } else if (weight > 100) {
        result = weight - 100;
        System.out.println("Emagraça: " + result + "Kg(s)");
      } else if (weight < 100) {
        result = 100 - weight;
        System.out.println("Engorde: " + result + "Kg(s)");
      }

    }
    input.close();
  }
}
