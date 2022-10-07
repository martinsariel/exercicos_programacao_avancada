package exerciseJava;
import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double popCountryA, popCountryB;
        int year=0;
        System.out.println("Informe a população do país A");
        popCountryA = input.nextDouble();
        System.out.println("Informe a população do país B");
        popCountryB = input.nextDouble();

        while(popCountryA<=popCountryB){
            popCountryA = (popCountryA * 0.03);
            popCountryB = (popCountryB * 0.015);
            year+=1;
        }

        System.out.println("É necessário "+ year +" anos");

        input.close();
    }
    
}
