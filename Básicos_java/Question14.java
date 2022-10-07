package exerciseJava;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, i=0;

        System.out.println("Informe um número inteiro");
        x = input.nextInt();

        if (x % 2 == 0){
            x++;            
        }

        while(i < 6){
            System.out.println(x);
            i++;
            x+=2;
        }

        input.close();
    }
    
}
