package exerciseJavaPoo.question16;

public class Destinatario {
	private String emailDestinatario;
	
	
	public Destinatario(String emailDestinatario) {
		super();
		this.emailDestinatario = emailDestinatario;
	}
	public void Buscar() {System.out.println("Destiatario, Buscar");}
	public void Adicionar() {System.out.println("Destiatario, Adicionar");}
	public void Apagar() {System.out.println("Destiatario, Apagar");}
	public String getEmailDestinatario() {
		return emailDestinatario;
	}
	public void setEmailDestinatario(String emailDestinatario) {
		this.emailDestinatario = emailDestinatario;
	}

	
}
