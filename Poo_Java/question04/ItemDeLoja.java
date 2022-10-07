package exerciseJavaPoo.question4;

public class ItemDeLoja {
protected int codigoDoItem; 
	protected String nomeDoItem;
	protected String descriçãoDoItem;
	protected double valorDoItem;
	public ItemDeLoja(int codigoDoItem, String nomeDoItem, String descriçãoDoItem, double valorDoItem) {
		
		this.codigoDoItem = codigoDoItem;
		this.nomeDoItem = nomeDoItem;
		this.descriçãoDoItem = descriçãoDoItem;
		this.valorDoItem = valorDoItem;
	}
	
	public int getIndentificador() {
		return codigoDoItem;
	}

	public int getCodigoDoItem() {
		return codigoDoItem;
	}

	public void setCodigoDoItem(int codigoDoItem) {
		this.codigoDoItem = codigoDoItem;
	}

	public String getNomeDoItem() {
		return nomeDoItem;
	}

	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}

	public String getDescriçãoDoItem() {
		return descriçãoDoItem;
	}

	public void setDescriçãoDoItem(String descriçãoDoItem) {
		this.descriçãoDoItem = descriçãoDoItem;
	}

	public double getValorDoItem() {
		return valorDoItem;
	}

	public void setValorDoItem(double valorDoItem) {
		this.valorDoItem = valorDoItem;
	}
	

}
