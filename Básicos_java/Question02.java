package exerciseJava;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employeeNumber;
        double hourValue, workedHours, finalSalary;
        System.out.println("Informe o número do funcionário:");
        employeeNumber = input.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        workedHours = input.nextDouble();
        System.out.println("Informe valor recebido por hora trabalhada:");
        hourValue = input.nextDouble();

        finalSalary = workedHours*hourValue;

        System.out.println("Funcionário "+employeeNumber);
        System.out.printf("Salário R$% .2f ", finalSalary);

        input.close();
    }
    
}
