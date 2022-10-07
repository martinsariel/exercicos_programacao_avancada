package exerciseJavaPoo.question17;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private String cpf;
	private URL foto;
	private String email;
	private Usuario usuario;
	private Evento evento;
	private List<Disciplina> disciplinas = new ArrayList();
	private List<Amigo> amigos = new ArrayList();
	public Pessoa(String nome, String cpf, URL foto, String email, Usuario usuario, Evento evento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.foto = foto;
		this.email = email;
		this.usuario = usuario;
		this.evento = evento;
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
	public URL getFoto() {
		return foto;
	}
	public void setFoto(URL foto) {
		this.foto = foto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	

}
