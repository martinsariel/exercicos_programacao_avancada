package exerciseJavaPoo.question18;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	private Date dataPedido;
	private Boolean status;
	private List<ItemPedido> item = new ArrayList();
	private BigDecimal valorTotal;
	
	
	
	public Pedido(Date dataPedido, Boolean status, BigDecimal valorTotal) {
		super();
		this.dataPedido = dataPedido;
		this.status = status;
		this.valorTotal = valorTotal;
	}



	public Date getDataPedido() {
		return dataPedido;
	}



	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}



	public Boolean getStatus() {
		return status;
	}



	public void setStatus(Boolean status) {
		this.status = status;
	}



	public BigDecimal getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}



	public void StatusPedido() {System.out.println("Funcionario, StatusPedido");}

}
