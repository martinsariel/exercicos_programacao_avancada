package exerciseJavaPoo.question6;
import java.util.Date;

public class Dependente {
	private int sequencial;
	private String nomeCompleto;
	private Date dataNascimento;
	private Integer sexo;
	private boolean participaPlano;
	
	public int getSequencial() {
		return sequencial;
	}
	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Integer getSexo() {
		return sexo;
	}
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	public boolean isParticipaPlano() {
		return participaPlano;
	}
	public void setParticipaPlano(boolean participaPlano) {
		this.participaPlano = participaPlano;
	}
	
}

