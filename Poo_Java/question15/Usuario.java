package exerciseJavaPoo.question15;

public class Usuario {
private Colaborador colaborador;
private String login;
private String senha;
private String permissao;
public Usuario(Colaborador colaborador, String login, String senha, String permissao) {
	super();
	this.colaborador = colaborador;
	this.login = login;
	this.senha = senha;
	this.permissao = permissao;
}
public Colaborador getColaborador() {
	return colaborador;
}
public void setColaborador(Colaborador colaborador) {
	this.colaborador = colaborador;
}
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getPermissao() {
	return permissao;
}
public void setPermissao(String permissao) {
	this.permissao = permissao;
}
private void editarPerfil() {
	System.out.println("Usuario, editarPerfi");
}
private void alterarSenha() {
	System.out.println("Usuario, alterarSenha");
}
private void criarUsuario() {
	System.out.println("Usuario, criarUsuario");
}
private void apagarUsuario() {
	System.out.println("Usuario, apagarUsuario");
}
}
