package exerciseJava;
import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nº X");
        int numberX = input.nextInt();
        System.out.println("Informe o nº Y");
        int numberY = input.nextInt();

        System.out.print(numberX + " é maior que " + numberY + "? ");
        if(numberX>numberY){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        System.out.print(numberX + " é igual a " + numberY + "? ");
        if(numberX==numberY){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        System.out.print(numberX + " é menor que " + numberY + "? ");
        if(numberX<numberY){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        System.out.print(numberX + " é diferente de " + numberY + "? ");
        if(numberX!=numberY){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        System.out.print(numberX + " é maior ou igual a " + numberY + "? ");
        if(numberX>=numberY){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        System.out.print(numberX + " é menor ou igual a " + numberY + "? ");
        if(numberX<=numberY){
            System.out.println("1");
        }else{
            System.out.println("0");
        }


        input.close();        
    }
    
}
