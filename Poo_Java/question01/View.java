package exerciseJavaPoo.question1;
import java.util.Scanner;

public class View {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("ID :");
	Integer id = input.nextInt();
	System.out.println("Ano :");
	Integer ano = input.nextInt();
	System.out.println("Modelo :");
	String modelo = input.next();
	System.out.println("Carga maxima :");
	Double carga_maxima = input.nextDouble();
	System.out.println("Potencia :");
	Double potencia = input.nextDouble();
	Transporte transporte = new Transporte(id, ano, modelo, carga_maxima, potencia);
	
	System.out.println(transporte.leiaModelo());
	System.out.println(transporte.consumo());
	
	
	
	
	input.close();	
}
}
