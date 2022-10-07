package exerciseJavaPoo.question18;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<PedidoDelivery> pedidoDelivery = new ArrayList();
	private String nome;
	private String cpf;
	private String nomeUsuario;
	private String cargo;
	private BigDecimal salario; 
	private Boolean status;
	private String senha;
	public Cliente(String nome, String cpf, String nomeUsuario, String cargo, BigDecimal salario, Boolean status,
			String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.nomeUsuario = nomeUsuario;
		this.cargo = cargo;
		this.salario = salario;
		this.status = status;
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
