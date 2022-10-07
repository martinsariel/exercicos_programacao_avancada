package exerciseJava;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, average;
        System.out.println("Informe a 1ª nota do aluno:");
        A = input.nextDouble();
        System.out.println("Informe a 2ª nota do aluno:");
        B = input.nextDouble();
        average=((A*3.5)+(B*7.5))/11;
        System.out.printf("A média ponderada é: %.5f",average);

        input.close();
    }
    
}
