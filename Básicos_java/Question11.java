package exerciseJava;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start, end, duration;
        System.out.println("Informe a hora de início do jogo:");
        start = input.nextInt();
        System.out.println("Informe a hora de encerramento do jogo:");
        end = input.nextInt();

        duration = 24-(24+start-end)%24;

        if (start == end) {
            System.out.println("O jogo durou 24 horas");
        } else {
            System.out.printf("O jogo durou %d horas.", duration);
        }

        input.close();        
    }
    
}
