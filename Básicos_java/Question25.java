package exerciseJava;
import java.util.Scanner;

public class Question25 { 
    public static void main(String[] args) {
    int[] requisitos = new int[5]; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Sobre os requisitos, responda 0 para não e 1 para sim");
		
		for(int i = 0; i < requisitos.length; i++) {

			do {
			System.out.printf("Informe se o seu trabalho possui %dº requisito: ", i+1);
			requisitos[i] = sc.nextInt(); 
			} while (requisitos[i] < 0 || requisitos[i] > 1); 
		}
		if(requisitos[1] == 1) {

			System.out.println("AVALIADO!"); 

		} else {

			System.out.println("0 (ZERO)");
			
		}
		
		sc.close();
    }
}

