package exerciseJavaPoo.question5;
import java.util.Date;

public class Alun {
	
		private String maticula;
		private String nome;
		private String cpf;
		private Date dateDeNascimento;
		private String sexo;
		private String endereco;
		private String cidade;
		private String uf;
		private Turm turma;
		
		public Alun(String maticula, String nome, String cpf, Date dateDeNascimento, String sexo, String endereco,
				String cidade, String uf, Turm turma) {
			
			this.maticula = maticula;
			this.nome = nome;
			this.cpf = cpf;
			this.dateDeNascimento = dateDeNascimento;
			this.sexo = sexo;
			this.endereco = endereco;
			this.cidade = cidade;
			this.uf = uf;
			this.turma= turma; 
		}
		public Turm getTurma() {
			return turma;
		}
		public void setTurma(Turm turma) {
			this.turma = turma;
		}
		public String getMaticula() {
			return maticula;
		}
		public void setMaticula(String maticula) {
			this.maticula = maticula;
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
		public Date getDateDeNascimento() {
			return dateDeNascimento;
		}
		public void setDateDeNascimento(Date dateDeNascimento) {
			this.dateDeNascimento = dateDeNascimento;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getUf() {
			return uf;
		}
		public void setUf(String uf) {
			this.uf = uf;
		}
	 
	}


