package exerciseJava;
import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {

        double[] medicao = new double[4];

        double media = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < medicao.length; i++) {

            System.out.printf("Informe a %dº medição para aferir sua glicose: ", i+1);
            medicao[i] = sc.nextDouble();

            media = medicao[i] + medicao[i] + medicao[i] + medicao[i] / 4;

            if(medicao[i] < 110) {

                System.out.println("NORMAL");

            } else if(medicao[i] < 125) {

                System.out.println("ALTERADA");

            } else if(medicao[i] > 125) {

                System.out.println("MUITO ALTERADA");
            }
        }

            System.out.printf("Média das Leituras: %.2f", media);

            sc.close();

        }

    }

