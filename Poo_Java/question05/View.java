package exerciseJavaPoo.question5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class View {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("TURMA");
		System.out.println();
		System.out.println("Cod:");
		String cod = sc.next();
		System.out.println("Turno:");
		String turno = sc.next();
		System.out.println("Sala:");
		Integer sala = sc.nextInt();
		Turm turma = new Turm(cod, turno, sala);
		System.out.println("Quantos alunos tera a turma? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Aluno " + i);
			System.out.println("");

			System.out.println("Matricula");
			String matricula = sc.next();
			System.out.println("Nome");
			String nome = sc.next();

			System.out.println("cpf");
			String cpf = sc.next();

			System.out.println("Data de nascimento");
			Date data = sdf.parse(sc.next());
			System.out.println("Sexo");
			String sexo = sc.next();
			System.out.println("Endereço");
			String endereco = sc.next();
			System.out.println("Cidade");
			String cidade = sc.next();
			System.out.println("Uf");
			String uf = sc.next();
			Alun aluno = new Alun(matricula, nome, cpf, data, sexo, endereco, cidade, uf, turma);
			turma.addAlunos(aluno);
	}
		
		sc.close();
	}

}
