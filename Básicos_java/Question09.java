package exerciseJava;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int duration, hour=0, minutes=0, seconds=0, value=0;
        System.out.println("Informe o tempo de duração do evento em segundos");
        duration = input.nextInt();

        hour=duration/3600;
        value=duration-(hour*3600);
        minutes=value/60;
        seconds=value-(minutes*60);

        System.out.println("HH:MM:SS = " + hour +"h"+ minutes +"m"+ seconds + "s");

        input.close();       
    }
    
}
