package exerciseJavaPoo.question15;

public class Parceiro {
	private String tipoPessoa;
	private float desempenho;
	private Fisica fisica;
	private Juridica juridica;
	
	
	public Parceiro(String tipoPessoa, float desempenho, Fisica fisica, Juridica juridica) {
		super();
		this.tipoPessoa = tipoPessoa;
		this.desempenho = desempenho;
		this.fisica = fisica;
		this.juridica = juridica;
	}
	public void cadastrar() {
		System.out.println("Parceiro, cadastrar");
	}
	public void bloquer() {
		System.out.println("Parceiro, bloquer");
	}
	public void excluir() {
		System.out.println("Parceiro, excluir");
	}
	

}
