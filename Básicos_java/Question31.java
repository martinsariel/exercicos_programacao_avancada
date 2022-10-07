package exerciseJava;
import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in); 

		double n1, n2; 

		double media; 

		System.out.println("Informe a 1ª nota: ");
		n1 = sc.nextDouble(); 

		System.out.println("Informe a 2ª nota: ");
		n2 = sc.nextDouble(); 

		if(n1 < 0 || n1 > 10 && n2 < 0 || n2 > 10) {

			System.out.println("NOTA INVÁLIDA");

		} else {

			media = (n1 + n2) / 2; 

			System.out.printf("MÉDIA: %.2f", media);
            sc.close();
        }
    }
}

