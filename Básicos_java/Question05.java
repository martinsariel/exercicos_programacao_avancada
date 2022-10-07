package exerciseJava;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Informe o 1º número:");
        number1 = input.nextInt();
        System.out.println("Informe o 2º número:");
        number2 = input.nextInt();
        System.out.println("Informe o 3º número:");
        number3 = input.nextInt();

        if((number1>number2)&&(number1>number3)){
            if(number2>number3){
                System.out.println(number3);
                System.out.println(number2);
                System.out.println(number1);
            }else{
                System.out.println(number2);
                System.out.println(number3);
                System.out.println(number1);
            }
        }else if((number2>number1)&&(number2>number3)){
            if(number1>number3){
                System.out.println(number3);
                System.out.println(number1);
                System.out.println(number2);
            }else{
                System.out.println(number1);
                System.out.println(number3);
                System.out.println(number2);
            }
        }else if((number3>number2)&&(number3>number1)){
            if(number1>number2){
                System.out.println(number2);
                System.out.println(number1);
                System.out.println(number3);
            }else{
                System.out.println(number1);
                System.out.println(number2);
                System.out.println(number3);
            }
        }
        input.close();
    }
    
}
