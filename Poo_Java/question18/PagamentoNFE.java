package exerciseJavaPoo.question18;
import java.math.BigDecimal;
import java.util.Date;

public class PagamentoNFE {
	private Pedido pedido;
	private BigDecimal valor;
	private Date dataPagamento;

	public PagamentoNFE(Pedido pedido, BigDecimal valor, Date dataPagamento) {
		super();
		this.pedido = pedido;
		this.valor = valor;
		this.dataPagamento = dataPagamento;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public void EfetuarPagamento() {
		System.out.println("PagamentoNFE, EfetuarPagamento");
	}
}
