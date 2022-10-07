package exerciseJava;
import java.util.Scanner;

public class Question48 {
  public static void main(String[] args) {
		
    int age;
    float weight;
    String doser;

    Scanner input = new Scanner(System.in);

    System.out.println("Qual e sua idade?");
    age = input.nextInt();

    System.out.println("Qual e seu peso?");
    weight = input.nextFloat();

    if(age >= 12){
      if(weight >= 60){
        System.out.println(" Deve tomar 1000mg /40 gotas");
      }else{
        System.out.println(" Deve tomar 875mg /35 gotas");
      }
    }

    doser = resultDoser(weight);

    System.out.printf(doser);

    input.close();
		
	}

  public static String resultDoser(float weight) {
    String result;
    if (weight >= 5 && weight <= 9)
      result = "Deve tomar 125mg /5 gotas";
    else if (weight >= 9.1 && weight <= 16)
      result = "Deve tomar 250mg /10 gotas";
    else if (weight >= 16.1 && weight <= 24)
      result = "Deve tomar 375mg /15 gotas";
    else if (weight >= 24.1 && weight <= 30)
      result = "Deve tomar 500mg /20 gotas";
    else
      result = "Deve tomar 750mg /30 gotas";
    return result;
  }

}