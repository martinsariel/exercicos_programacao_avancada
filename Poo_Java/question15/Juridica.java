package exerciseJavaPoo.question15;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Juridica extends Pessoa {

	private String cnpj;
	private String inscricaoEstadual;
	private Date fundacao;
	private List<Parceiro> parceiros = new ArrayList<>();


	public Juridica(int id, String nome, String nomeFantasia, String logradouro, int numero, String comlemento,
			String bairro, String cep, String cidade, String uf, String cnpj, String inscricaoEstadual, Date fundacao) {
		super(id, nome, nomeFantasia, logradouro, numero, comlemento, bairro, cep, cidade, uf);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.fundacao = fundacao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public Date getFundacao() {
		return fundacao;
	}

	public void setFundacao(Date fundacao) {
		this.fundacao = fundacao;
	}

}
