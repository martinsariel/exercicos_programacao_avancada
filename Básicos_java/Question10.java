package exerciseJava;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day=0, month=0, year=0, age, value=0;
        System.out.println("Informe sua idade em dias:");
        age = input.nextInt();

        year=age/365;
        value=age-(year*365);       
        month=value/30;      
        day=value-(month*30);      

        System.out.println("Idade");
        System.out.println(year + " ano(s)");
        System.out.println(month +" mês(es)");
        System.out.println(day + " dia(s)");
        
        input.close();
    }
    
}
