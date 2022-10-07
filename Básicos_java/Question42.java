package exerciseJava;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Question42 {

  public static void main(String[] args) {
    DecimalFormat decimalFormat = new DecimalFormat("##,##00.00");

    Scanner input = new Scanner(System.in);

    Double laggedPrice, actualPrice, priceOscilation, percentage;

    System.out.print("Digite o preço antigo: ");
    laggedPrice = input.nextDouble();

    System.out.print("Digite o preço atual: ");
    actualPrice = input.nextDouble();

    priceOscilation = actualPrice - laggedPrice;
    percentage = (priceOscilation / laggedPrice) * 100;

    System.out.println(decimalFormat.format(percentage) + "%");

    input.close();

  }
}
