package exerciseJava;
import java.util.Scanner;

public class Question26{
    public static void main(String[] args) {
        float resultado = 1;
        float altura;
        int idade;
        
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Digite sua altura");
            altura = sc.nextFloat();
        System.out.println("Digite sua idade");
            idade= sc.nextInt();
        
// 1,5 ou 1,4 ou 1,7 - 12, 14, 16
        if (altura >= 1.5 && idade >=12) {
            resultado = resultado +1;
        } 
        else if (altura >= 1.4 && idade >=14) {
            resultado = resultado +1;
        }
        else if (altura >= 1.7 && idade >=16) {
            resultado = resultado +1;
        }
        System.out.println(resultado);

        sc.close();
    }
}
