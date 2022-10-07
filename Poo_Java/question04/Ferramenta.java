package exerciseJavaPoo.question4;

public class Ferramenta extends ItemDeLoja {

	private String categoria;
	private Integer serial;

	public Ferramenta(int codigoDoItem, String nomeDoItem, String descriçãoDoItem, double valorDoItem,
			Integer serial) {
		super(codigoDoItem, nomeDoItem, descriçãoDoItem, valorDoItem);
		
		this.serial = serial;
	}

	public String getCategoria() {
		return categoria;
	}



	

	@Override
	public int getIndentificador() {
		// TODO Auto-generated method stub
		return serial;
	}
	
	public void separa(String valor) {
     categoria = valor ;
	}

	public void separar() {
         if (categoria == null) {
        	 categoria = "Outros";
         }
	}

}
