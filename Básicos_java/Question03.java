package exerciseJava;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String employeeName;
        double fixedSalary, salesValue, comission, finalSalary;

        System.out.println("Digite o nome do funcionário:");
        employeeName = input.nextLine();
        System.out.println("Informe o salário fixo:");
        fixedSalary = input.nextDouble();
        System.out.println("Informe o total em vendas realizadas");
        salesValue = input.nextDouble();
        comission = salesValue*0.15;
        finalSalary = fixedSalary + comission;

        System.out.println("Funcionário "+employeeName);
        System.out.printf("Salário fixo R$ %.2f\n",fixedSalary);
        System.out.printf("Valor total em vendas R$ %.2f\n",salesValue);
        System.out.printf("Salário final R$ %.2f",finalSalary);


        input.close();
    }
    
}
