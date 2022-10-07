package exerciseJava;
import java.util.Scanner;

public class Question49 {
  public static void main(String[] args) {
		
    float weight, height;
    float imc;
    String classification;

		Scanner input = new Scanner(System.in);
      System.out.println("Enter weight: (Kg)");
      weight = input.nextFloat();

      System.out.println("Enter height: (m) ");
      height = input.nextFloat();

      imc = imcCalculation(weight, height);

      classification = resultIMC(imc);

      System.out.printf("IMC = %.1f - %s\n", imc, classification);

      input.close();
		
	}
  public static float imcCalculation(float weight, float height){
    return weight / (height * height);
  }

  public static String resultIMC(float imc) {
    String result;
    if (imc <= 19)
      result = "Abaixo do Peso";
    else if (imc <= 25)
      result = "Peso Normal";
    else if (imc <= 30)
      result = "Sobrepeso";
    else if (imc <= 35)
      result = "Obeso";
    else
      result = "Obeso Mórbido";

    return result;
  }
}