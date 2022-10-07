package exerciseJava;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance;
        double fuel,consumption;
        System.out.println("Informe a distância percorrida:");
        distance = input.nextInt();
        System.out.println("Informe a quantidade de combustível gasto(Em litro):");
        fuel = input.nextDouble();
        consumption = distance/fuel;
        System.out.printf("Consumo médio %.3f km/l",consumption);

        input.close();
    }
    
}
