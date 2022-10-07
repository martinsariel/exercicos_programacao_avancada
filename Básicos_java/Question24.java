package exerciseJava;
import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, threeNumber, fourNumber, fiveNumber; 
		int value;
		
		System.out.println("Informe um valor: ");
		value = input.nextInt(); 
		
		if(value < 10000 && value > 99999) {
			
			System.out.println("Valor inválido, Informe um número correto: "); 
			value = input.nextInt(); 
		}
		
		fiveNumber = value % 10; 
		value /= 10; 
		
		fourNumber = value % 10; 
		value /= 10; 
		
		threeNumber = value % 10; 
		threeNumber = threeNumber + 0;
		value /= 10;
		
		secondNumber = value % 10;
		value /= 10; 
		
		firstNumber = value % 10; 
		
		if(firstNumber == fiveNumber && secondNumber == fourNumber) {
			
			System.out.println("Sim");
			
		} else {
			
			System.out.println("Não");
		}
        
        input.close();   
    }
    
}
