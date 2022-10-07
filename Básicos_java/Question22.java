package exerciseJava;
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total, waterConsumption = 0;
        
        do{
        System.out.println("Informe seu consumo em m³");
        waterConsumption = input.nextInt();
        }while(waterConsumption<0);

        if(waterConsumption>=0 && waterConsumption<=10){
            total = 7;
            System.out.println("O valor que você precisa pagar é R$"+ total);
        }else if(waterConsumption>=11 && waterConsumption<=30){
            total = 7 + (1*(waterConsumption-10));
            System.out.println("O valor que você precisa pagar é R$" + total);
        }else if(waterConsumption>=31 && waterConsumption<=100){
            total = 7 + 20 + (2*(waterConsumption-30));
            System.out.println("O valor que você precisa pagar é R$" + total);
        }else if(waterConsumption>100){
            total = 7 + 20 + 140 + (5*(waterConsumption-100));
            System.out.println("O valor que você precisa pagar é R$" + total);
        }

        input.close();        
    }
    
}
