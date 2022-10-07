package exerciseJava;
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        int number, c = 0;
        
        do{
        System.out.println("Informe um número inteiro");
        number = input.nextInt();
        }while(number<0);

            for (int n = 1; n <= number; n++) {
                if (number % n == 0) {
                    c++;
                }        
            }
            if(c==2) {
                System.out.println(number + " é um número primo pois possui apenas "+ c + " divisores");                
            }else {
                System.out.println(number + " não é um número primo e possui "+ c + " divisores");
            }

        input.close();
            
    }
}


