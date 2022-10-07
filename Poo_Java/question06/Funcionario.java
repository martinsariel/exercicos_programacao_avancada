package exerciseJavaPoo.question6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario {
	private Integer matricula;
	private String nomeCompleto;
	private String cpf;
	private Date dataNasimento;
	private Integer sexo;
	private double salario;
	private int telefone;
	private List<Dependente> dependentes =new ArrayList<>();
	
	public Funcionario(Integer matricula, String nomeCompleto, String cpf, Date dataNasimento, Integer sexo,
			double salario, int telefone) {
		super();
		this.matricula = matricula;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNasimento = dataNasimento;
		this.sexo = sexo;
		this.salario = salario;
		this.telefone = telefone;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNasimento() {
		return dataNasimento;
	}
	public void setDataNasimento(Date dataNasimento) {
		this.dataNasimento = dataNasimento;
	}
	public Integer getSexo() {
		return sexo;
	}
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	} 
	

}
