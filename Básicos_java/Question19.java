package exerciseJava;
import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double wage, finalSalary;
        System.out.println("Informe seu salário:");
        wage = input.nextDouble();

        if(wage>500){
            finalSalary = wage + (wage * 0.10);
            System.out.printf("O salário final é de R$ %.2f", finalSalary);
        }else if((wage>300)&&(wage<=500)){
            finalSalary = wage + (wage * 0.07);
            System.out.printf("O salário final é de R$ %.2f", finalSalary);
        }else{
            finalSalary = wage + (wage * 0.05);
            System.out.printf("O salário final é de R$ %.2f", finalSalary);

        }
        



        input.close();
    }
    
}
