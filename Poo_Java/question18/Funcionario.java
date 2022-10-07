package exerciseJavaPoo.question18;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
	
	private Gerente gerente;
	private List<PedidoBasico> pedidosBasicos = new ArrayList(); 
	
	public Funcionario(String nome, String cpf, int matricula, String nomeUsuario, String cargo, BigDecimal salario,
			Boolean status, String senha, Gerente gerente) {
		super(nome, cpf, matricula, nomeUsuario, cargo, salario, status, senha);
		this.gerente = gerente;
		
	}
	
	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public void ListarPedidos() {System.out.println("Funcionario, ListarPedidos");}
	public void EditarPedido() {System.out.println("Funcionario, EditarPedido");}

}
