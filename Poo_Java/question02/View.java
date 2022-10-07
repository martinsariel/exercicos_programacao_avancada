package exerciseJavaPoo.question2;

import java.util.Date;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Id :");
		Integer id = sc.nextInt();
		System.out.println("Nome :");
		String nome = sc.next();
		System.out.println("Descrição :");
		String descricao = sc.next();
		Date date = new Date();
		Produto produto = new Produto(id, nome, descricao, date);
		System.out.println(produto.getValidade());
		System.out.println(produto.getCod());
		
		sc.close();	
	}

}
