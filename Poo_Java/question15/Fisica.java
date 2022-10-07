package exerciseJavaPoo.question15;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fisica extends Pessoa {

	private String cpf;
	private String rg;
	private String genero;
	private Date dataNasc;
	private List<Parceiro> parceiros = new ArrayList<>();

	public Fisica(int id, String nome, String nomeFantasia, String logradouro, int numero, String comlemento,
			String bairro, String cep, String cidade, String uf, String cpf, String rg, String genero, Date dataNasc) {
		super(id, nome, nomeFantasia, logradouro, numero, comlemento, bairro, cep, cidade, uf);
		this.cpf = cpf;
		this.rg = rg;
		this.genero = genero;
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
