package exerciseJava;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salaryMan, salaryWoman, jointIncome, aliquot=0,netIncome;
        System.out.println("Cálculo do Imposto de Renda(IR)");
        System.out.println("Informe a renda do homem:");
        salaryMan = input.nextDouble();
        System.out.println("Informe a renda da mulher:");
        salaryWoman = input.nextDouble();
        jointIncome = salaryMan + salaryWoman;

        System.out.printf("Renda conjunta R$ %.2f\n",jointIncome);
        if(jointIncome<=900.00){
            aliquot = jointIncome * 0;
            netIncome = jointIncome - aliquot;
            System.out.println("Alíquota utilizada- IR: Isento");
            System.out.printf("Imposto de Renda R$ %.2f\n",aliquot);
            System.out.printf("Renda Líquida R$ %.2f\n",netIncome);

        }else if((jointIncome>900.00)&&(jointIncome<=1500.00)){
            aliquot = jointIncome * 0.10;
            netIncome = jointIncome - aliquot;
            System.out.println("Alíquota utilizada- IR: 10%");
            System.out.printf("Imposto de Renda R$ %.2f\n",aliquot);
            System.out.printf("Renda Líquida R$ %.2f\n",netIncome);
        
        }else if((jointIncome>1500.00)&&(jointIncome<=2500.00)){
            aliquot = jointIncome * 0.15;
            netIncome = jointIncome - aliquot;
            System.out.println("Alíquota utilizada- IR: 15%");
            System.out.printf("Imposto de Renda R$ %.2f\n",aliquot);
            System.out.printf("Renda Líquida R$ %.2f\n",netIncome);
        
        }else if((jointIncome>2500.00)){
            aliquot = jointIncome * 0.25;
            netIncome = jointIncome - aliquot;
            System.out.println("Alíquota utilizada- IR: 25%");
            System.out.printf("Imposto de Renda R$ %.2f\n",aliquot);
            System.out.printf("Renda Líquida R$ %.2f\n",netIncome);
        }

        input.close();
    }
    
}
