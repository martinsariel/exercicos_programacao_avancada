package exerciseJava;
import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a, b, c, d;
    boolean e = true;

    d=0;

    while(e)
    {

			System.out.printf("Digite um valor para A: ");
			a = sc.nextInt(); 

			System.out.printf("Digite um valor para B: ");
			b = sc.nextInt();

			if(a <= 0 || b <= 0) {

			} else {

				d = 0; 

				if(a < b) {

					for(c = a; c <= b; c++) {

						System.out.printf("%d", c); 
						d += c;
					}

					System.out.printf(" Soma = %d \n", d); 

				} else if (a > b) {

					for(c = b; c <= a; c++) {

						System.out.printf("%d", c); 
						d+=c; 
					}

					System.out.printf(" Soma = %d \n", d);
                    sc.close();
                }
            }
        }
    }
    
}
