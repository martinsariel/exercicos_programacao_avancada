package exerciseJava;
import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        
		double a = 1; 
		double b = 2;

		for(int i = 3; i < 40; i++) {

			a += i / b;

			i++;

			b *= 2;
		}

		System.out.printf("%.2f", a);

        sc.close();
    }
}

