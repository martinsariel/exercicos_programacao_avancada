package exerciseJavaPoo.question18;
import java.math.BigDecimal;
import java.util.Date;

public class Caixa {
	private BigDecimal valorReceita;
	private Date dataAbertura;
	private Date dataFechamento;
	public Caixa(BigDecimal valorReceita, Date dataAbertura, Date dataFechamento) {
		
		this.valorReceita = valorReceita;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
	}
	public BigDecimal getValorReceita() {
		return valorReceita;
	}
	public void setValorReceita(BigDecimal valorReceita) {
		this.valorReceita = valorReceita;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataFechamento() {
		return dataFechamento;
	}
	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}
	
	

}
