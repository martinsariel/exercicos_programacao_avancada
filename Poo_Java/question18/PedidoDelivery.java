package exerciseJavaPoo.question18;
import java.math.BigDecimal;
import java.util.Date;

public class PedidoDelivery extends Pedido{
	
	private Cliente cliente;

	public PedidoDelivery(Date dataPedido, Boolean status, BigDecimal valorTotal, Cliente cliente) {
		super(dataPedido, status, valorTotal);
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

}
