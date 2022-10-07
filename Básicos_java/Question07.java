package exerciseJava;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do{
        System.out.println("Informe um número inteiro em reais:");
        number = input.nextInt();
        }while(number<0);

        int currentValue = number;
        int grades100 = currentValue / 100;

        currentValue = currentValue - grades100 * 100;
        int grades50 = currentValue / 50;
        
        currentValue = currentValue - grades50 * 50;
        int grades20 = currentValue / 20;

        currentValue = currentValue - grades20 * 20;
        int grades10 = currentValue / 10;

        currentValue = currentValue - grades10 * 10;
        int grades5 = currentValue / 5;

        currentValue = currentValue - grades5 * 5;
        int grades2 = currentValue / 2;

        currentValue = currentValue - grades2 * 2;
        int grades1 = currentValue;
        
        System.out.println(number);
        System.out.println(grades100 + " nota(s) de R$ 100,00");
        System.out.println(grades50 + " nota(s) de R$ 50,00");
        System.out.println(grades20 + " nota(s) de R$ 20,00");
        System.out.println(grades10 + " nota(s) de R$ 10,00");
        System.out.println(grades5 + " nota(s) de R$ 5,00");
        System.out.println(grades2 + " nota(s) de R$ 2,00");
        System.out.println(grades1 + " nota(s) de R$ 1,00");

        input.close();
    }
    
}
