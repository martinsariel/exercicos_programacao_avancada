package exerciseJavaPoo.question18;
import java.math.BigDecimal;
import java.util.Date;

public class PedidoBasico extends Pedido{

	

	private String nome;
	private Gerente gerente;
	private Funcionario funcionario;

	public PedidoBasico(Date dataPedido, Boolean status, BigDecimal valorTotal, String nome, Gerente gerente, Funcionario funcionario) {
		super(dataPedido, status, valorTotal);
		this.nome = nome;
		this.gerente = gerente; 
		this.funcionario = funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
}
