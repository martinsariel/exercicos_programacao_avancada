package exerciseJava;
import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] yearCar = new int [3];
        double [] velocityCar = new double [3];
        int yearNewCar = 10000;
        double fastetCar = 0;

        for(int i=0;i<yearCar.length;i++){
            System.out.printf("Informe o ano do %dº carro: ", i+1);
            yearCar[i] = input.nextInt();
            if (yearCar[i] < yearNewCar) {
				yearNewCar = yearCar[i];
			}
        }

        for(int j=0;j<velocityCar.length;j++){
            System.out.printf("Informe a velocidade do %dº carro: ", j+1);;
            velocityCar[j] = input.nextDouble();
            if (velocityCar[j] > fastetCar) {
				fastetCar = velocityCar[j];
			}
        }

        System.out.println("O ano do carro mais novo é " + yearNewCar);
        System.out.println("A velocidade do carro rápido " + fastetCar);
        
        input.close();
    }
    
}
