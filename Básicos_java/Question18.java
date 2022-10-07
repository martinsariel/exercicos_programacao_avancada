package exerciseJava;
import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Informe um número com 4 algarismos:");
        int number = input.nextInt();

        if(number > 9999){
				System.out.print("O nº" + number + " digitado ultrapassou a quantidade máxima permitida de 4 algarismos");
		}else {
			while(number > i){
			    i *= 10;
				i += (number % 10);
				number /= 10;
			}
            
			System.out.println("Número invertido" + i);
		}

        input.close();        
    }
}
