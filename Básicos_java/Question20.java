package exerciseJava;
import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            double payment, discount;

            System.out.println("ELETROSHOCK S.A - Distribuição de Energia");
            System.out.println("Informe seu bairro apenas digitando a 1ª letra inicial");
            System.out.println("I - Industriários\nS - Santa Ana\nT - Tabatinga");
            String district = input.nextLine();
            
            if(district != "I" || district != "i"|| district != "S"|| district != "s"|| district != "T"|| district != "t") {
                System.out.println("Bairro inválido");
                System.exit(0);             
            }
            
            System.out.println("Informe sua renda:");
            double income = input.nextDouble();

            System.out.println("Informe seu consumo em reais:");
            double consumption = input.nextDouble();

            if(("I".equalsIgnoreCase(district))){
                if(income>=240 && income<=1000){
                    discount = 240;
                    payment = consumption - discount;
                    System.out.println("Desconto R$240,00\n O total a pagar é de R$" + payment);
                }else if(income>1000 && income<=5000){
                    discount = 120;
                    payment = consumption - discount;
                    System.out.println("Desconto R$120,00\n O total a pagar é de R$" + payment);
                }else if(income<0){
                    System.out.println("Renda e consumo não podem ser negativos");
                }else{
                    System.out.println("Não possui desconto\n O total a pagar é de R$" + consumption);
                }
            }else if(("S".equalsIgnoreCase(district))){
                if(income>=50 && income<=500){
                    discount = 50;
                    payment = consumption - discount;
                    System.out.println("Desconto R$50,00\n O total a pagar é de R$" + payment);
                }else if(income>500 && income<=1000){
                    discount = 25;
                    payment = consumption - discount;
                    System.out.println("Desconto R$25,00\n O total a pagar é de R$" + payment);
                }else if(income<0){
                    System.out.println("Renda e consumo não podem ser negativos");
                }else{
                    System.out.println("Não possui desconto\n O total a pagar é de R$" + consumption);
                }
            }else if(("T".equalsIgnoreCase(district))){
                if(income>=1000 && income<5000){
                    discount = 720;
                    payment = consumption - discount;
                    System.out.println("Desconto R$720,00\n O total a pagar é de R$" + payment);
                }else if(income>10000 && income<=20000){
                    discount = 360;
                    payment = consumption - discount;
                    System.out.println("Desconto R$360,00\n O total a pagar é de R$" + payment);
                }else if(income<0){
                    System.out.println("Renda e consumo não podem ser negativos");
                }else{
                    System.out.println("Não possui desconto\n O total a pagar é de R$" + consumption);
                }
            }

        input.close();
    }
    
}
