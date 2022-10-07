package exerciseJavaPoo.question16;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String nomeDoEmail; 
	private Texto texto;
	private List<Destinatario> destinatarios= new ArrayList();
	private Arquivos arquivos;
	public Email(String nomeDoEmail, Texto texto, Arquivos arquivos) {
		super();
		this.nomeDoEmail = nomeDoEmail;
		this.texto = texto;
		this.arquivos = arquivos;
	}
	public void escrever() {System.out.println("Email, escrever");}
	public void excluir() {System.out.println("Email, excluir");} 
	public void anexar() {System.out.println("Email, anexar");}
	public void responder() {System.out.println("Email, responder");}
	public String getNomeDoEmail() {
		return nomeDoEmail;
	}
	public void setNomeDoEmail(String nomeDoEmail) {
		this.nomeDoEmail = nomeDoEmail;
	}
	public Texto getTexto() {
		return texto;
	}
	public void setTexto(Texto texto) {
		this.texto = texto;
	}
	public Arquivos getArquivos() {
		return arquivos;
	}
	public void setArquivos(Arquivos arquivos) {
		this.arquivos = arquivos;
	}
	
	
}
