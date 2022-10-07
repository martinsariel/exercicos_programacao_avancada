package exerciseJavaPoo.question18;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Pessoa {
	private List<Funcionario> funcionarios = new ArrayList(); 
	private List<PedidoBasico> pedidosBasicos = new ArrayList();
	
	
	
    public Gerente(String nome, String cpf, int matricula, String nomeUsuario, String cargo, BigDecimal salario,
			Boolean status, String senha) {
		super(nome, cpf, matricula, nomeUsuario, cargo, salario, status, senha);
	}
	public void ListaFucion() {System.out.println("Gerente, ListaFuncion");}
	public void ListaClient() {System.out.println("Gerente, ListaClient");}
	public void CriarFuncionario() {System.out.println("Gerente, CriarFuncionario");}

}
