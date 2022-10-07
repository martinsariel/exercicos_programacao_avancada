package exerciseJavaPoo.question5;
import java.util.ArrayList;
import java.util.List;

public class Turm {
	private String cod;
	private String turno;
	private Integer sala;
	private List<Alun> alunos = new ArrayList<>();
	public Turm(String cod, String turno, Integer sala) {
		
		this.cod = cod;
		this.turno = turno;
		this.sala = sala;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Integer getSala() {
		return sala;
	}
	public void setSala(Integer sala) {
		this.sala = sala;
	}
	public List<Alun> getAlunos() {
		return alunos;
	}
	public void addAlunos(Alun alunos ){
		 this.alunos.add(alunos);
	}
	 

}


